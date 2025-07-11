import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO creates some books and users
        Book book = new Book(12,"Atomic habits","Bhijan",5);
        try{
            Connection conn= DatabaseConnection.connect();
            String query = "INSERT INTO book (BookNumber, BookName, BookAuthor, BookQuantity) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,book.getBookNumber());
            ps.setString(2,book.getBookName());
            ps.setString(3,book.getAuthor());
            ps.setInt(4,book.getBookQuantity());
            if(ps.executeUpdate() > 0){
                System.out.println("Book Inserted Successfully");
            }else{
                System.out.println("Book Insert Failed");
            }
        }
        catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);

        }






        Book Book1 = new Book(21,"Marvel","Stan Lee",10);
        Book book2 = new Book(11,"SoloLeveling","Thaxaina",10);
        Book book3 = new Book(231,"Titanic","ThaVayena",10);
        Book book4 = new Book(111,"Magadheera","Thaxaina",10);

        //User
        User user1 = new User("Bhijan","Bhijan-01",981029303);
        try{
            Connection conn= DatabaseConnection.connect();
            String query = "INSERT INTO user(Name, UserName, Contact) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,user1.getName());
            ps.setString(2, user1.getUserName());
            ps.setInt(3,user1.getContactId());
            if(ps.executeUpdate() > 0){
                System.out.println("User Inserted Successfully");
            }else{
                System.out.println("User Insert Failed");
            }
        }
        catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);

        }
        //TODO show available option
        //TODO show options: available books, borrow book, return book
        while (true) {
            System.out.println("Welcome to the library ");
            System.out.println("Enter 1: Show available books");
            System.out.println("Enter 2: Borrow books");
            System.out.println("Enter 3: Return books");
            System.out.println("Enter 4: Exit");
            System.out.println("Choose an option (1-4)");

            int option = input.nextInt();
            if (option == 1) {

                try{
                    Connection conn= DatabaseConnection.connect();
                    ArrayList<Book> booklist = new ArrayList<>();
                    String query = "SELECT BookNumber, BookName, BookAuthor, BookQuantity FROM book";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ResultSet bookSet = ps.executeQuery();//select gareesi execute vako
                    while(bookSet.next()){
//                        int bookNumber = bookSet.getInt("BookNumber");
//                        String bookName = bookSet.getString("BookName");
//                        String bookAuthor = bookSet.getString("BookAuthor");
//                        int bookQuantity = bookSet.getInt("BookQuantity");
                        Book Book0 = new Book(bookSet.getInt("BookNumber"),
                                bookSet.getString("BookName"),
                                bookSet.getString("BookAuthor"),
                                bookSet.getInt("BookQuantity"));
                        booklist.add(Book0);
                    }
                    for(Book Book0: booklist){
                        System.out.println( "BookNumber"+"\n"+Book0.getBookNumber()+"\n"+"BookName"+"\n"+Book0.getBookName()+"\n"+"Book author"+"\n"+Book0.getAuthor()+"\n"+"BookQuantity"+"\n"+Book0.getBookQuantity());


                    }
                }
                catch (SQLException | ClassNotFoundException e){
                    throw new RuntimeException(e);

                }
            }else if (option == 2) {
                System.out.println("Before: "+book.getBookQuantity());
                user1.BorrowBook(user1, book);
                System.out.println("After: " + book.getBookQuantity());
            }else if (option == 3) {
                System.out.println("working on returning books");
            } else if (option == 4) {
                System.out.println("exiting");
                break;
            } else if (option > 4) {
                System.out.println("Invalid option! Please try using the value from 1-4");
                break;
            }
        }

        //TODO need to figure out where to keep the books and users?

        //TODO .......
    }
}
