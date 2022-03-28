package basics.task2;

public class Speedometer {

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    public static Bike chooseWinner(int mountainBikesSpeed, int roadBikesSpeed) {
        if (mountainBikesSpeed > roadBikesSpeed) {
            return Bike.MOUNTAIN;
        } else {
            return Bike.ROAD;
        }

        //TODO: What if speeds are equals???
    }

}