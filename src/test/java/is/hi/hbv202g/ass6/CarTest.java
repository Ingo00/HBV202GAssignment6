package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final String BEETLE = "Beetle";

    @Test
    public void getNameOfCar() {
        Car car=new Car(BEETLE);
        assertEquals(BEETLE, car.getName());
    }

}
