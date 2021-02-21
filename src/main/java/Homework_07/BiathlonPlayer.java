package Homework_07;

import lombok.*;

import java.time.LocalTime;

@Builder
@Data

public class BiathlonPlayer {

    private int athNumber;
    private String countryCode;
    private String athName;
    private LocalTime resultTime;
    private String shootingResult;

    public static BiathlonPlayer mapLineToSkier(String line) {

        String[] fields = line.split(",");
        return BiathlonPlayer.builder()
                .athNumber(Integer.parseInt(fields[0]))
                .athName(fields[1])
                .countryCode(fields[2])
                .resultTime(mapResultToLocalTime(fields[3]))
                .shootingResult(fields[4] + fields[5] + fields[6])
                .build();
    }
    public static LocalTime mapResultToLocalTime(String timeInCSV) {
        String[] time = timeInCSV.split(":");
        return LocalTime.of(0, Integer.parseInt(time[0]), Integer.parseInt(time[1]));
    }

    public void  applyPenalties(BiathlonPlayer biathlonPlayer){
        LocalTime thirdRunPenalty = LocalTime.of(0,0,0);
        char[] results = biathlonPlayer.shootingResult.toCharArray();
        for (char t : results){
            if(t == '0'){
                biathlonPlayer.setResultTime(getResultTime().plusSeconds(10));
                biathlonPlayer.setShootingResult(biathlonPlayer.getShootingResult()+10);
            }
        }

    }
}
