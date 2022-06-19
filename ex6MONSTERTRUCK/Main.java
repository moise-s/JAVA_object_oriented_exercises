// Crie uma classe MonsterTruck cujos métodos tenham o comportamento descrito na tabela a seguir.
// Não apenas imprima/retorne a saída; sempre que possível, use herança para reutilizar o comportamento da superclasse.
// Método	Saída / Retorno
// m1	monstro 1
// m2	caminhao 1  carro 1
// toString	"monster vruumvruum"

package ex6MONSTERTRUCK;

public class Main {

  public static void main(String[] args) {

    //Car car = new Car();
    //Truck truck = new Truck();
    MonsterTruck monsterTruck = new MonsterTruck();

    monsterTruck.m1();
    monsterTruck.m2();
    System.out.println(monsterTruck);

  }
}
