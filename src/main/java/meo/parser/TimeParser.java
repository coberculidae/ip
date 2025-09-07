package meo.parser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



public class TimeParser {
    protected static final DateTimeFormatter[] FORMATTERS = {
        DateTimeFormatter.ofPattern("d/M/yyyy"),
        DateTimeFormatter.ofPattern("d/M/yyyy HHmm"),
        DateTimeFormatter.ofPattern("d/M/yyyy ha")
    };

    public static String parseTime(String text) {
        LocalDateTime time = null;
        text = text.toLowerCase();
        // Try all formats until it is correct
        for (DateTimeFormatter format : FORMATTERS) {
            try {
                time = LocalDateTime.parse(text, format);
                break;
            } catch (DateTimeParseException e) {
            }
        }   

        // If no format matches
        if (time == null) {
            return "NA";
        }

        String timeFormatted = time.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm"));
        return timeFormatted;
    }

    public static void main(String[] args) {
        System.out.println(parseTime("2/12/2004 1400"));
        System.out.println(parseTime("2/12/2004 2AM"));
    }
}
