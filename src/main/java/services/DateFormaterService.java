package services;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormaterService {
  public static Date convertDate(String inpStringDate){

        long d = Date.parse( inpStringDate);
        return new Date(d);
    }
}
