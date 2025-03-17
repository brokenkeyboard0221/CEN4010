package Interfaces.WorkerOps;
import Interfaces.Job;
/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * Interface that manages the details of a job
 */
public interface JobController {

    /**
     * Gets the details for a job: jobID, description, availability
     * @param jobID The ID assigned to a job upon being posted
     * @return Job with details
     */
    Job getJobDetails(int jobID);
}
