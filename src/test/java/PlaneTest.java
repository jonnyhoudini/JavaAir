import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
Plane plane;

@Before
    public void before(){
    plane = new Plane(PlaneType.Airbus_A320);
}

@Test
    public void hasPlaneType(){
    assertEquals(PlaneType.Airbus_A320, plane.getPlaneType());
}

@Test
    public void hasCapacity(){
    assertEquals(300, plane.getPlaneType().getCapacity());
}

@Test
    public void hasWeight(){
    assertEquals(48000, plane.getPlaneType().getWeight());
}

}
