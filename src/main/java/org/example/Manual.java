package org.example;

import java.util.List;
import java.util.Objects;

public class Manual {
  private boolean withGps;
  private boolean withTripComputer;
  private int seatNumber;
  private String model;
  private String engine;
  private List<String> features;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manual manual = (Manual) o;
    return withGps == manual.withGps && withTripComputer == manual.withTripComputer &&
        seatNumber == manual.seatNumber && Objects.equals(model, manual.model) &&
        Objects.equals(engine, manual.engine) &&
        Objects.equals(features, manual.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withGps, withTripComputer, seatNumber, model, engine, features);
  }

  public Manual() {
    this.seatNumber = 0;
    this.withGps = false;
    this.withTripComputer = false;
  }

  @Override
  public String toString() {
    return "Manual{" +
        "withGps=" + withGps +
        ", withTripComputer=" + withTripComputer +
        ", seatNumber=" + seatNumber +
        ", model='" + model + '\'' +
        ", engine='" + engine + '\'' +
        ", features=" + features +
        '}';
  }

  public boolean isWithGps() {
    return withGps;
  }

  public void setWithGps(boolean withGps) {
    this.withGps = withGps;
  }

  public boolean isWithTripComputer() {
    return withTripComputer;
  }

  public void setWithTripComputer(boolean withTripComputer) {
    this.withTripComputer = withTripComputer;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }
}
