// Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.

package ex5LIBRARY;

public class Main {
  public static void main(String[] args) {

    Person moises = new Person("Moisés", 27, 1.73);
    Person igor = new Person("Igor", 16, 1.68);
    //Person grasiela = new Person("Grasiela", 49, 1.56);
    //Person itamar = new Person("Itamar", 54, 1.68);
    Person beatriz = new Person("Beatriz", 26, 1.73);

    Book book1 = new Book("1984", "George Orwell");
    Book book2 = new Book("O homem e seus símbolos", "Carl G. Jung");
    Book book3 = new Book("A Voz do Silêncio", "Helena Blavatsky");
    //Book book4 = new Book("O Príncipe", "Nicolau Maquiavel");

    BookLoan loan = new BookLoan();

    loan.newLoan(moises, book1);
    loan.newLoan(igor, book2);
    loan.newLoan(beatriz, book3);

    loan.printLoanList();
    loan.closeLoan(moises, book1);
    loan.printLoanList();

  }
}
