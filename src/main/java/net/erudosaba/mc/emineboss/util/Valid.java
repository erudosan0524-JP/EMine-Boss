package net.erudosaba.mc.emineboss.util;

public class Valid {

    public static void checkBoolean(boolean b, String message) {
        if(!b) {
            System.out.println(message);
        }
    }
}
