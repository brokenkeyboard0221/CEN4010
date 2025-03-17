package Interfaces.WorkerOps;
/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * Interface that anages the availability status of a job
 */
public interface WorkAvailabilityController {
    /**
     * Updates the availability status of a job
     * @param jobID The ID assigned to a job upon being posted
     * @param availability A boolean showing if a job is available
     * @return true if job is available, false otherwise
     */
    boolean updateAvailability(int jobID, boolean availability);

}
