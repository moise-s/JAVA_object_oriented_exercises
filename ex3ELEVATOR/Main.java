// Crie uma classe denominada Elevator para armazenar as informações de um elevador
// dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
// no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
// presentes nele. A classe deve também disponibilizar os seguintes métodos:

// begin: que deve receber como parâmetros a capacidade do elevador e o total de
// andares no prédio (os elevadores sempre começam no térreo e vazio);
// getPersonIn: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
// espaço);
// getPersonOff: para remover uma pessoa do elevador (só deve remover se houver alguém
// dentro dele);
// goUp: para subir um andar (não deve subir se já estiver no último andar);
// goDown: para descer um andar (não deve descer se já estiver no térreo);
// Encapsular todos os atributos da classe (criar os métodos get e set). 

package ex3ELEVATOR;

public class Main {
  public static void main(String[] args) {

    Elevator elevator1 = new Elevator();
    elevator1.begin(3, 3);
    elevator1.getPersonIn();
    elevator1.goUp();
    elevator1.goUp();
    elevator1.getPersonIn();
    elevator1.getPersonOff();
    elevator1.goDown();
    System.out.println(elevator1.getNumberOfPeopleInside());
    System.out.println(elevator1.getCurrentFloor());

  }
}
