package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeModel {

    public String getCurrentTime() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}