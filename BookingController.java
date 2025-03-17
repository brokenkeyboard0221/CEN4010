package Interfaces.CustomerOps;
import java.util.List;
/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * Interface that anages customer bookings
 */
public interface BookingController {
    /**
     * Retrieves customer's booking history.
     * @param custID The ID of the customer.
     * @return A list of all previous bookings.
     */
    List<String> viewBookingHistory(int custID);

    /**
     *
     * @param custID The ID of the customer
     * @param ServDate The customer's preferred set day of service
     * @return true if booking is successful, otherwise false
     */
    boolean bookACRepair(int custID, String ServDate);
}
