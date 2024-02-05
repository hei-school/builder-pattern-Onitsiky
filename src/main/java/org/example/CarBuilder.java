package org.example;

public class CarBuilder implements Builder {
  private Car car;

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(int seats) {
    this.car.setSeats(seats);
  }

  @Override
  public void setEngine(String engine) {
    this.car.setEngine(engine);
  }

  @Override
  public void setTripComputer() {
    this.car.setTripComputer(true);
  }

  @Override
  public void setGps() {
    this.car.setGps(true);
  }

  public Car getProduct() {
    return this.car;
  }
}
