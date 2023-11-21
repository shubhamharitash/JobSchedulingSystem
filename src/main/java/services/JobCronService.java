package services;

import dto.JobCron;

import java.util.Date;

public class JobCronService {
    public void setCronJob(Date cronTime,long jobInterval,Date jobEndTime){
        JobCron jobCron=new JobCron(cronTime,jobInterval,jobEndTime);
    }
    public int runJob(){
        int counter=0;
        while (true){
            Date currentTime=new Date(System.currentTimeMillis());
            if (currentTime.after(JobCron.getJobStartTime())){
                DisplayService.display();
                JobCron.setJobStartTime(new Date(JobCron.getJobStartTime().getTime()+JobCron.getJobRepitetionInterval()));
                counter++;
            }else if (currentTime.after(JobCron.getJobEndTime())){
                break;
            }
        }
        return counter;
    }
}
