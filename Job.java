package Interfaces;

/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * This is the Job Object Class
 */

public class Job {
    private int jobID;
    private String jobName;
    private String description;
    private String availability;

    Job() {
    jobID = 0;
    jobName = "";
    description = "";
    availability = "pending";
}
    Job(int jobID, String jobName, String description, String availability) {
        this.jobID = jobID;
        this.jobName = jobName;
        this.description = description;
        this.availability = availability;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobID=" + jobID +
                ", description='" + description + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
