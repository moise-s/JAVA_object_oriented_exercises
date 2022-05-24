package ex5LIBRARY;

public class Book {
  private String bookName;
  private String bookAuthor;

  public Book(String bookName, String bookAuthor) {
    this.bookName = bookName;
    this.bookAuthor = bookAuthor;
  }

  @Override
  public String toString() {
    return "Book [bookAuthor=" + bookAuthor + ", bookName=" + bookName + "]";
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

}
