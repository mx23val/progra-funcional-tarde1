package pe.edu.upao.carro.controllers;

import pe.edu.upao.carro.models.Car;

import java.util.List;

public class ParkingController {

    private ParkingService parkingService;

    public ResponseEntity<List<Car>> getAllsCars(){
        return parkingService.ok(this.parkingService.getAllcars());

    }


}
