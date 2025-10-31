import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingTest {

    @Test
    void testEnterParkingLot() {
        Parking parking = new Parking();        	parking.enterParkingLot(101);
        assertEquals(101, parking.carSlots[0]);   
  }

    @Test
    void testLeaveParkingLot() {
        Parking parking = new Parking(); 
        parking.enterParkingLot(101);
        parking.leaveParkingLot(1);
        assertEquals(0, parking.carSlots[0]);
    }

    @Test
    void testInvalidSlotLeave() {
        Parking parking = new Parking(); 
        parking.leaveParkingLot(25);         
        assertEquals(0, parking.carSlots[0]);
    }

    
    
}
