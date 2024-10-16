package view;

import java.time.LocalTime;
import java.time.Duration;

public class Time {
    public static LocalTime subtrair(LocalTime time, long minutes) {
        Duration duration = Duration.ofMinutes(minutes);
        return time.minus(duration);
    }
}