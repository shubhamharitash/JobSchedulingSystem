package contants;

import java.util.Date;

public class JobCronContants {
    public static final Date jobStartTime=new Date(System.currentTimeMillis()+10000);
    public static final long jobRunInterval=5000;
    public static final Date jobEndTime=new Date(jobStartTime.getTime()+1000*60*1);
}
