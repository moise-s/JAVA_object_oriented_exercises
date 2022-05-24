// Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade e altura.
// Crie os métodos públicos necessários para gets e sets e também um método para imprimir todos dados de uma pessoa.
// Crie um método "fazerAniversario()" para incremntar a idade da pessoa. 

package ex2PERSON;

public class Main {

  public static void main(String[] args) {

    Person moises = new Person("Moisés", 27, 1.73);
    moises.printPerson();
    moises.birthday();
    moises.printPerson();

  }
}
