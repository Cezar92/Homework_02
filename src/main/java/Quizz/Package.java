package Quizz;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Builder
@Data
@Getter
@Setter

public class Package {
    private String location;
    private int distance;
    private int value;
    LocalDate date;


    public static Package mapLineToPackage(String line) {

        String[] fields = line.split(",");
        return Package.builder()
                .location(fields[0])
                .distance(Integer.parseInt(fields[1]))
                .value(Integer.parseInt(fields[2]))
                .date(mapToDeliveryDate(fields[3]))
                .build();

    }


    public static LocalDate mapToDeliveryDate(String dateInCSV) {
        String[] time = dateInCSV.split("-");
        return LocalDate.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
    }


    public static int groupValue(Integer integer) {
        int sum = 0;
        return sum = sum+ integer;
    }

    public static void dateToString(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy LLLL dd");
        String formattedString = localDate.format(formatter);

    }
}
