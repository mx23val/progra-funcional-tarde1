package pe.edu.upao;

import pe.edu.upao.carro.services.CarServiceRest;
import pe.edu.upao.carro.services.ICarService;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Map<String, Object> bolsaBeansSpring = new HashMap<>();
        bolsaBeansSpring.put("CarService", new CarServiceRest());

        System.out.println("--------Modulo1000--------");
        ICarService carService= (ICarService) bolsaBeansSpring.get("CarService");
        haceCosasComplejas(carService);

        System.out.println("--------Modulo1001--------");
        ICarService carService2= (ICarService) bolsaBeansSpring.get("CarService");
        haceCosasComplejas(carService2);

        System.out.println("--------Modulo1002--------");
        ICarService carService3= new CarServiceRest();
        haceCosasComplejas(carService3);
    }
    public static void haceCosasComplejas(ICarService carService) {

        carService.printListCars();
    }


}