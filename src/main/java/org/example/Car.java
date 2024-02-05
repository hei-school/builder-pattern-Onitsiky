package org.example;

import java.util.List;
import java.util.Objects;

public class Car {
  private boolean gps;
  private boolean tripComputer;
  private int seats;
  private String model;
  private String engine;
  private List<String> features;

  public Car() {
    this.tripComputer = false;
    this.gps = false;
    this.seats = 0;
  }

  @Override
  public String toString() {
    return "Car{" +
        "gps=" + gps +
        ", tripCompute=" + tripComputer +
        ", seats=" + seats +
        ", model='" + model + '\'' +
        ", engine='" + engine + '\'' +
        ", features=" + features +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return gps == car.gps && tripComputer == car.tripComputer && seats == car.seats &&
        Objects.equals(model, car.model) && Objects.equals(engine, car.engine) &&
        Objects.equals(features, car.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gps, tripComputer, seats, model, engine, features);
  }

  public void setGps(boolean gps) {
    this.gps = gps;
  }

  public void setTripComputer(boolean tripComputer) {
    this.tripComputer = tripComputer;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }
}
