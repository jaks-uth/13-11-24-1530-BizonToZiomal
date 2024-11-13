//plik : VehiclesTest.java
package pl.example.vehicles;
import ...
public class Vehiclestest{
    @Test
    public void testCarMaxSpeed(){
        pl.example.vehicles.Car car= new pl.example.vehicles.Car(name:"sedan",doors: 4);
        assertEquals(expected:200, car.getMaxSpeed());
    }
    @Test
    public void testBikeMaxSpeed(){
        pl.example.vehicles.Bike bike= new pl.example.vehicles.Bike(name:"Mountain Bike");
        assertEquals(expected:50, bike.getMaxSpeed());
    }
    @Test
    public void testCarDoors(){
        pl.example.vehicles.Car car=new pl.example.vehucles.Car(name:"Hatchback", doors:5);
        assertEquals(expected:5, car.getDoors());
    }
    @Test
    public void testVehiclename(){
        pl.example.vehicles.Car Car = new Car("Convertible",2);
        assertEquals(expected:"Convertiable",Car.getName());
    }
}