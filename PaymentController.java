package Interfaces.CustomerOps;
/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * Interface that anages payments between customers and workers
 */
public interface PaymentController {
    /**
     * Processes the payment of a service
     * @param custID The customer ID
     * @param workID The worker ID
     * @param pay The payment amount made from the customer to the worker
     * @return true if payment is successful, otherwise false
     */
    boolean processPayment(int custID, int workID, double pay);
}
