package basics.task2;

public class RoadBike implements Bicycle {

    private int gear;
    private int speed;

    private static final int MIN_SPEED = 0;
    private static final int MAX_SPEED = 50;
    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 10;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != 2 && newGear != -1 && newGear != -2) {
            throw new BikeException("Value is not allowed. Try using " + getGearSuggestion(newGear));
        } else if (MAX_GEAR - newGear < MIN_GEAR) {
            throw new BikeException("Value is not allowed. Gear cannot be over the max " + MAX_GEAR + " or below " + MIN_GEAR);
        }
        this.speed += gear;
        System.out.println("Current roadbike gear is: " + this.speed);
    }

    private String getGearSuggestion(int input) {
        return input == 0 ? "1 or -1" : (input > 0 ? "2" : "-2");
    }

    @Override
    public void speedUp(int increment) {
        if (increment > 0) {
            throw new BikeException("Negative numbers are not allowed. Insert only negative numbers");
        } else if (increment + speed > MAX_SPEED) {
            throw new BikeException("Speed is too high. The highest possible value is: " + (MAX_SPEED - speed));
        }
        this.speed += increment;
        System.out.println("Current roadbike speed is:" + this.speed);

    }

    @Override
    public void applyBrakes(int brakingPower) {
        if (brakingPower < 0) {
            throw new BikeException("Positive numbers are not allowed. Insert only negative numbers");
        } else if (brakingPower - speed < MIN_SPEED) {
            throw new BikeException(" Value is too high. The highest possible value is: " + (MIN_SPEED - speed));
        }
        this.speed -= brakingPower;
        System.out.println("Current roadbike speed is:" + this.speed);

    }
}
