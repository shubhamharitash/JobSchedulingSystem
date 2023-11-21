import services.DateFormaterService;
import services.JobCronService;
import services.ResourceFileService;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import static contants.JobCronContants.*;


public class Application {
    public static void main(String[] args)  {
        JobCronService jobCronService=new JobCronService();

        //To Read cron Customisation Data from Resource file
        ResourceFileService resourceFileService=new ResourceFileService();
        File file=resourceFileService.getFileResources("application.yaml");
        resourceFileService.generateDataUsingFile(file);


        //core logic of job cron
        jobCronService.setCronJob(jobStartTime,jobRunInterval,jobEndTime);
        int jobRunCount=jobCronService.runJob();
        System.out.println("Number of Jobs run="+jobRunCount);


    }


}
