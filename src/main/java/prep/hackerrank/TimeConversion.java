package main.java.prep.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class TimeConversion {

    static String timeConversion(String s) {
        int hour = Integer.valueOf(s.substring(0, 2));
        boolean isAm = s.substring(8, 10).equals("AM");

        String result = "";

        if (hour == 12) {
            result += isAm ? "00:" : "12:";
        } else {
            result += (!isAm ? String.valueOf(12 + hour) : hour < 10 ? "0" + String.valueOf(hour) : hour) + ":";
        }

        result += s.substring(3, 8);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00AM"));
    }
}
