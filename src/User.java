public class User {
    //attributes-->Name,Contact
    //TODO create the attributes
    private String name;
    private String UserName;
    private int contactId;

    public User(String name, String userName, int contactId) {
        this.name = name;
        UserName = userName;
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    //TODO behaviours -> Check if registered , borrow , return
    public void CheckRegistered(){
        System.out.println("need to work in registration");
    }
    public void BorrowBook(User user1 ,Book book){
        System.out.println("need to work in borrowing");
        if(book.getBookQuantity()>0){
            Record record = new Record(user1, book);
            book.decreaseQantity();
        }else {
            System.out.println("Out of Stock");
        }
    }
    public void ReturningBook(){
        System.out.println("need to work in returning ");
    }
}
