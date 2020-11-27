package net.erudosaba.mc.emineboss.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class TimeUtil {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static long currentTimeSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public static long currentTimeTicks() {
        return System.currentTimeMillis() / 50;
    }

    public static String getFormattedDate() {
        return getFormattedDate(System.currentTimeMillis());
    }

    public static String getFormattedDate(final long time) {
        return DATE_FORMAT.format(time);
    }

    /*
    Converter
     */
    public static long toTicks(final String time) {
        if(Objects.isNull(time)) {
            System.out.println("Time is null");
        }

        long seconds = 0L;

        final String[] split = time.split(" ");

        for(int i=1; i < split.length; i++) {
            final String sub = split[i].toLowerCase();
            int multipiler = 0;
            long unit = 0;
            boolean isTicks = false;

            try {
                multipiler = Integer.parseInt(split[i-1]);
            } catch(final NumberFormatException e) {
                continue;
            }

            if (sub.startsWith("tick"))
                isTicks = true;

            else if (sub.startsWith("second"))
                unit = 1;

            else if (sub.startsWith("minute"))
                unit = 60;

            else if (sub.startsWith("hour"))
                unit = 3600;

            else if (sub.startsWith("day"))
                unit = 86400;

            else if (sub.startsWith("week"))
                unit = 604800;

            else if (sub.startsWith("month"))
                unit = 2629743;

            else if (sub.startsWith("year"))
                unit = 31556926;

            else if (sub.startsWith("potato"))
                unit = 1337;

            else
                throw new IllegalArgumentException("Must define date type! Example: '1 second' (Got '" + sub + "')");

            seconds += multipiler * (isTicks ? 1 : unit * 20);
        }
        return seconds;
    }

}
