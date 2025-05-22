package kuke.board.hotarticle.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeCalculatorUtils {
    public static Duration calculateDurationToMidNight() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime midNight = now.plusDays(1L).with(LocalTime.MIDNIGHT);
        return Duration.between(now, midNight);
    }
}
