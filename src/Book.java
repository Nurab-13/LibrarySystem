public class Book {
    //attributes-->book number, nam, quantity, author
    //TODO create the attributes
    private int bookNumber;
    private String bookName;
    private String author;
    private int bookQuantity;

    public Book(int bookNumber, String bookName, String author, int bookQuantity ) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.author = author;
        this.bookQuantity = bookQuantity;

    }


    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookID) {
        this.bookNumber = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int Quantity) {
        this.bookQuantity = Quantity;
    }

    //behaviours -> increse quantity , decrease quantity
    public void increaseQantity(){
        System.out.println("need to work in increase");
        this.bookQuantity++;
    }
    public void decreaseQantity(){
        this.bookQuantity--;
        System.out.println("need to work in decrease");
    }
}