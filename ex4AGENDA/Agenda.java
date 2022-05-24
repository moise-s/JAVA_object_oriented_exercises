package ex4AGENDA;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
  private int agendaSize;
  private List<Person> agendaData;

  public void NewAgenda(int agendaSize) {
    this.agendaSize = agendaSize;
    this.agendaData = new ArrayList<Person>();
  }

  public void addPerson(Person person) {
    if (agendaData.size() < this.getAgendaSize()) {
      this.agendaData.add(person);
    }
  }

  public void removePerson(Person person) {
    this.agendaData.remove(person);
  }

  public void searchPerson(Person person) {
    if (agendaData.indexOf(person) != -1) {
      System.out.println("This person is in list position: " + agendaData.indexOf(person));
    } else {
      System.out.println("This person is not in list.");
    }
  }

  public void printAgenda() {
    System.out.println(this.agendaData);
  }

  public void printPerson(int i) {
    System.out.println(agendaData.get(i));
  }

  public int getAgendaSize() {
    return agendaSize;
  }

  public void setAgendaSize(int agendaSize) {
    this.agendaSize = agendaSize;
  }

  public List<Person> getAgendaData() {
    return agendaData;
  }

  public void setAgendaData(List<Person> agendaData) {
    this.agendaData = agendaData;
  }

}
