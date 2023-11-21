package dto;

import java.util.Date;

public class JobCron {


    static Date jobStartTime;

    public static Date getJobEndTime() {
        return jobEndTime;
    }

    public static void setJobEndTime(Date jobEndTime) {
        JobCron.jobEndTime = jobEndTime;
    }

    static Date jobEndTime;


    public static long getJobRepitetionInterval() {
        return jobRepitetionInterval;
    }

    public JobCron(Date jobTime1,long jobRepitetionInterval1,Date jobEndTime1) {
        jobStartTime =jobTime1;
        jobRepitetionInterval=jobRepitetionInterval1;
        jobEndTime=jobEndTime1;
    }

    static long jobRepitetionInterval;



    public static Date getJobStartTime() {
        return jobStartTime;
    }

    public static void setJobStartTime(Date jobTime1) {
        jobStartTime = jobTime1;
    }

}
