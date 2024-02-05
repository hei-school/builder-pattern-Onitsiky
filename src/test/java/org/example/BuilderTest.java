package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderTest {

  static Car expectedSUVCar() {
    Car result = new Car();
    result.setEngine("Electric");
    result.setGps(true);
    result.setSeats(5);
    result.setTripComputer(true);
    return result;
  }

  static Car expectedSportCar() {
    Car result = new Car();
    result.setEngine("Gasoline");
    result.setGps(true);
    result.setSeats(2);
    result.setTripComputer(true);
    return result;
  }

  static Manual expectedSUVManual() {
    Manual result = new Manual();
    result.setEngine("Electric");
    result.setWithGps(true);
    result.setSeatNumber(5);
    result.setWithTripComputer(true);
    return result;
  }

  static Manual expectedSportCarManual() {
    Manual result = new Manual();
    result.setEngine("Gasoline");
    result.setWithGps(true);
    result.setSeatNumber(2);
    result.setWithTripComputer(true);
    return result;
  }

  @Test
  void make_suv_ok() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    director.makeSUV(carBuilder);
    var actualCar = carBuilder.getProduct();
    ManualBuilder manualBuilder = new ManualBuilder();
    director.makeSUV(manualBuilder);
    var actualManual = manualBuilder.getProduct();

    assertEquals(Car.class, actualCar.getClass());
    assertEquals(Manual.class, actualManual.getClass());
    assertEquals(expectedSUVCar(), actualCar);
    assertEquals(expectedSUVManual(), actualManual);
  }

  @Test
  void make_sport_car_ok() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    director.makeSportCar(carBuilder);
    var actualCar = carBuilder.getProduct();
    ManualBuilder manualBuilder = new ManualBuilder();
    director.makeSportCar(manualBuilder);
    var actualManual = manualBuilder.getProduct();

    assertEquals(Car.class, actualCar.getClass());
    assertEquals(Manual.class, actualManual.getClass());
    assertEquals(expectedSportCar(), actualCar);
    assertEquals(expectedSportCarManual(), actualManual);
  }
}
