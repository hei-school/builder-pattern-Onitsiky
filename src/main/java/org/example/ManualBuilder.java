package org.example;

public class ManualBuilder implements Builder {
  private Manual manual;

  @Override
  public void reset() {
    this.manual = new Manual();
  }

  @Override
  public void setSeats(int seats) {
    this.manual.setSeatNumber(seats);
  }

  @Override
  public void setEngine(String engine) {
    this.manual.setEngine(engine);
  }

  @Override
  public void setTripComputer() {
    this.manual.setWithTripComputer(true);
  }

  @Override
  public void setGps() {
    this.manual.setWithGps(true);
  }

  public Manual getProduct() {
    return this.manual;
  }
}
