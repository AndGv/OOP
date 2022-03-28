package basics.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.Assert;



@ExtendWith(MockitoExtension.class)
public class MountainBikeTest {

    public static final String NEGATIVE_NUMBER_MESSAGE = "Braking value cannot be negative number. Insert only positive numbers";
    public static final String HIGH_NUMBER_MESSAGE = "Value is too high. Highest possible value is: ";

    @Test
    public void Should_GetCurrentSpeed() {
        MountainBike mountainBike = new MountainBike(0, 10);
        mountainBike.applyBrakes(5);
        Assert.assertEquals(mountainBike.getSpeed(), 5);
    }

    @Test
    public void Should_ThrowException_When_BrakingPowerIsNegative() {
        MountainBike mountainBike = new MountainBike(0, 10);
        BikeException bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(-20));
        Assert.assertEquals(bikeException.getMessage(), NEGATIVE_NUMBER_MESSAGE);
        bikeException= Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(-1));
        Assert.assertEquals(bikeException.getMessage(), NEGATIVE_NUMBER_MESSAGE);
        bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(-30));
        Assert.assertEquals(bikeException.getMessage(), NEGATIVE_NUMBER_MESSAGE);
        bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(-2000));
        Assert.assertEquals(bikeException.getMessage(), NEGATIVE_NUMBER_MESSAGE);
    }

    @Test
    public void Should_ThrowException_When_BrakingPowerIsTooHigh() {
        MountainBike mountainBike = new MountainBike(0, 10);

        BikeException bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(100));
        Assert.assertEquals(bikeException.getMessage(), HIGH_NUMBER_MESSAGE);
        bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(50));
        Assert.assertEquals(bikeException.getMessage(), HIGH_NUMBER_MESSAGE);
        bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(30));
        Assert.assertEquals(bikeException.getMessage(), HIGH_NUMBER_MESSAGE);
        bikeException = Assert.expectThrows(BikeException.class, () -> mountainBike.applyBrakes(60));
        Assert.assertEquals(bikeException.getMessage(), HIGH_NUMBER_MESSAGE);
    }

}