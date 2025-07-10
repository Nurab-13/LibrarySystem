import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO creates some books and users
        Book book = new Book(12,"Atomic habits","Bhijan",5);
        Book Book1 = new Book(21,"Marvel","Stan Lee",10);
        Book book2 = new Book(11,"SoloLeveling","Thaxaina",10);
        Book book3 = new Book(231,"Titanic","ThaVayena",10);
        Book book4 = new Book(111,"Magadheera","Thaxaina",10);

        //User
        User user1 = new User("Bhijan","Bhijan-01",981029303);
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
                System.out.println( "working on showing available books");
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
