package week5.object;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Mercedes", "s600",
                new Engine("RX345", "Mercedes"));


        Car cloned = car.clone();
        Car copied = new Car(car);


        System.out.println("source = " + car);
        System.out.println("cloned = " + cloned);
        System.out.println("copied = " + copied);


        Car newCar = new Car("BMW", "520",
                new Engine("BMW-20", "BMW"));


        System.out.println(car.equals(cloned));

        System.out.println(car.equals(newCar));


        System.out.println("HASHCODE - " + car.hashCode());


        car = null;
        System.gc();


        System.out.println(cloned.equals(new Car("Mercedes", "s600",
                new Engine("RX345", "Mercedes")){

            int number = 10;

        }));

    }

}
