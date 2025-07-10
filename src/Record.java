public class Record {
    //Attribute-->
    private User user;
    private Book book;
    private String date;
    private boolean isReturned;

    public Record(User user, Book book) {
        this.user = user;
        this.book = book;
        this.date = "date";//TODO jati bela add gareko ho teti bela ko date huna parxa
        this.isReturned = false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
