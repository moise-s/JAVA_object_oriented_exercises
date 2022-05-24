package ex5LIBRARY;

import java.util.ArrayList;
import java.util.List;

public class BookLoan {
  private List<Person> loanListPersons;
  private List<Book> loanListBooks;

  public BookLoan() {
    this.loanListPersons = new ArrayList<Person>();
    this.loanListBooks = new ArrayList<Book>();
  }

  public void newLoan(Person person, Book book) {
    this.loanListPersons.add(person);
    this.loanListBooks.add(book);
  }

  public void closeLoan(Person person, Book book) {
    this.loanListPersons.remove(person);
    this.loanListBooks.remove(book);
  }

  public void printLoanList() {
    for (int j = 0; j < this.loanListBooks.size(); j++) {
      System.out.println(this.loanListPersons.get(j).getName() + " borrowed " + this.loanListBooks.get(j).getBookName());
    }

  }

}
