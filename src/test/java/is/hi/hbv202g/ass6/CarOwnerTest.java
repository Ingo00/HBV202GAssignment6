package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    public static final String NAMEOFOWNER = "John Doe";
    private Car car;

    private CarOwner carOwner;

    @Before
    public void setup() throws Exception {
        carOwner = new CarOwner(NAMEOFOWNER, car);
    }

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
    }

    @Test
    public void getName() {
        assertEquals(NAMEOFOWNER, carOwner.getName());
    }

}