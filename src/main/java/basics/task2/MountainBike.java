package basics.task2;

public class MountainBike implements Bicycle {

    private int gear;
    private int speed;

    private static final int MIN_SPEED = -10;
    private static final int MAX_SPEED = 100;
    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 20;

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != -1) {
            throw new BikeException("This value is not allowed. Try using 1 or -1");
        }
        else if (newGear >0){
            throw new BikeException("Negative numbers are not allowed.Insert only postive numbers");
        }
        else if (gear + newGear > MAX_GEAR || gear + newGear < MIN_GEAR){
            throw new BikeException("Value is not allowed. Gear cannot be over the max :" + (MAX_GEAR) + "or below" + (MIN_GEAR));
        }
        this.gear += newGear;
        System.out.println("New mountainbike gear is: " + this.gear);

    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new BikeException("Negative numbers are not allowed. Insert only positive numbers");
        } else if (increment > 100) {
            throw new BikeException("Speed is too high. Hihgest possible increment can be: " + (MAX_SPEED - increment));
        }
        this.speed += increment;
        System.out.println("Current mountainbike speed is: " + this.speed);
    }

    @Override
    public void applyBrakes(int brakingPower) {
        if (brakingPower < 0) {
            throw new BikeException("Braking value cannot be negative number. Insert only positive numbers");
        } else if (speed - brakingPower < MIN_SPEED) {
            throw new BikeException("Value is too high. Highest possible value is: " + (speed - MIN_SPEED));
        }
        this.speed -= brakingPower;
        System.out.println("Current mountainbike speed is: " + this.speed);
    }

}