// Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:

// void armazenaPessoa(String nome, int idade, float altura);
// void removePessoa(String nome);
// int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
// void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
// void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda. 

package ex4AGENDA;

public class Main {
  public static void main(String[] args) {

    Person moises = new Person("Moisés", 27, 1.73);
    Person igor = new Person("Igor", 16, 1.68);
    Person grasiela = new Person("Grasiela", 49, 1.56);
    Person itamar = new Person("Itamar", 54, 1.68);
    Person beatriz = new Person("Beatriz", 26, 1.73);

    Agenda agenda1 = new Agenda();
    agenda1.NewAgenda(10);

    agenda1.addPerson(beatriz);
    agenda1.addPerson(moises);
    agenda1.addPerson(igor);
    agenda1.removePerson(igor);
    agenda1.addPerson(itamar);
    agenda1.addPerson(grasiela);
    agenda1.printAgenda();
    agenda1.searchPerson(moises);
    agenda1.searchPerson(igor);
    agenda1.printPerson(1);
  }
}
