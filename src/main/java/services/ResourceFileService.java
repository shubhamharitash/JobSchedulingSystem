package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class ResourceFileService {
    private File getResourceFile(final String fileName)
    {
        URL url = this.getClass()
                .getClassLoader()
                .getResource(fileName);

        if(url == null) {
            throw new IllegalArgumentException(fileName + " is not found 1");
        }

        File file = new File(url.getFile());

        return file;
    }
    public File getFileResources(String fileName){
        return getResourceFile(fileName);
    }

    public void generateDataUsingFile(File file){
        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Date startTime = null;
        Date endTime = null;
        long interval = 0;
        while (scanner.hasNext()){
            String line=scanner.nextLine();
            String[] words=line.trim().split(":");
            if (words[0].equals("interval"))
                interval=Long.parseLong(words[1]);
            if (words[0].equals("startTime")) {
                String   startStringTime = words[1];
                startTime=DateFormaterService.convertDate(startStringTime);
            }if (words[0].equals("endTime")) {
                String   endStringTime = words[1];
                endTime=DateFormaterService.convertDate(endStringTime);
            }
        }
        System.out.println("Interval in application yaml file is "+interval);
        System.out.println("StartTime in application yaml file is"+startTime);
        System.out.println("EndTime in application yaml file is"+endTime);

    }


}
