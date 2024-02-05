package org.example;

public class Director {
  void makeSUV(Builder builder) {
    builder.reset();
    builder.setEngine("Electric");
    builder.setSeats(5);
    builder.setTripComputer();
    builder.setGps();
  }

  void  makeSportCar(Builder builder) {
    builder.reset();
    builder.setEngine("Gasoline");
    builder.setSeats(2);
    builder.setTripComputer();
    builder.setGps();
  }
}
