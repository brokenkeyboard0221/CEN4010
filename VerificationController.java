package Interfaces.AuthenticationOps;

/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * Interface for worker verification
 */
public interface VerificationController {
    /**
     * Verifies the worker's identity, qualifications, and experience
     * @param workerID The ID of the worker upon creating an account
     * @return true if worker info is successfully verified, otherwise false
     */
    boolean verifyWorker(int workerID);
}
