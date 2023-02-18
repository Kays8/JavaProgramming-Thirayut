public class Car {
    /* Attributes */
    public int size;
    public String color;
    public String model;

    public static void main(String[] args) {
        // moveForward();
        // moveBackward();
        // stop();
        // turnOnLight();
        // turnOffLight();

        // Car blackCar = new Car();
        // blackCar.color = "black";
        // blackCar.model = "Mercedes";
        // blackCar.size = 2;

        // System.out.println("Car color: " + blackCar.color);
        // System.out.println("Car model: " + blackCar.model);
        // System.out.println("Car size: " + blackCar.size);

        Car whiteCar = new Car();
        whiteCar.color = "white";
        whiteCar.model = "Mercedes Benz";
        whiteCar.size = 4;

        System.out.println("Car color: " + whiteCar.color);
        System.out.println("Car model: " + whiteCar.model);
        System.out.println("Car size: " + whiteCar.size);

        whiteCar.stop();

    }

    /* Methods #ต้องเรียนเพิ่มเติม ! ! ! */

    public void moveForward() {
        System.out.println(this.model + " move forward");
    }

    public void moveBackward() {
        System.out.println(this.model + " move backward");

    }

    public void stop() {
        System.out.println(this.model + " stop");
    }

    public void turnOnLight() {
        System.out.println(this.model + " turn on light");
    }

    public void turnOffLight() {
        System.out.println(this.model + " turn off light");
    }
}