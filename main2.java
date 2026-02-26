public class main2 {
    public static void main(String [] args){
        Car car = new Car() ;
        car.setMake("ferrari");
        car.setModel("carrera");
        car.setDoors(2);
        car.setColor("Black");
        System.out.println("make = "+ car.getMake());
        System.out.println("model = "+ car.getModel());
        car.describeCar();
    }
}
