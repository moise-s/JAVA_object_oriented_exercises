package ex3ELEVATOR;

public class Elevator {
  private int currentFloor;
  private int totalFloors;
  private int elevatorCapacity;
  private int numberOfPeopleInside;

  public void begin(int elevatorCapacity, int totalFloors) {
    this.currentFloor = 0;
    this.numberOfPeopleInside = 0;
    this.elevatorCapacity = elevatorCapacity;
    this.totalFloors = totalFloors;
  }

  public void getPersonIn() {
    if (this.numberOfPeopleInside < this.elevatorCapacity) {
      this.numberOfPeopleInside++;
    }
  }

  public void getPersonOff() {
    if (this.numberOfPeopleInside > 0) {
      this.numberOfPeopleInside--;
    }
  }

  public void goUp() {
    if (this.currentFloor < this.totalFloors) {
      this.currentFloor++;
    }
  }

  public void goDown() {
    if (this.currentFloor > 0) {
      this.currentFloor--;
    }
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void setCurrentFloor(int currentFloor) {
    this.currentFloor = currentFloor;
  }

  public int getTotalFloors() {
    return totalFloors;
  }

  public void setTotalFloors(int totalFloors) {
    this.totalFloors = totalFloors;
  }

  public int getElevatorCapacity() {
    return elevatorCapacity;
  }

  public void setElevatorCapacity(int elevatorCapacity) {
    this.elevatorCapacity = elevatorCapacity;
  }

  public int getNumberOfPeopleInside() {
    return numberOfPeopleInside;
  }

  public void setNumberOfPeopleInside(int numberOfPeopleInside) {
    this.numberOfPeopleInside = numberOfPeopleInside;
  }

}
