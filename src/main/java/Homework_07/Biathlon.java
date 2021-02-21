package Homework_07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Homework_07.BiathlonPlayer.mapLineToSkier;
//import static Homework_07.BiathlonPlayer.applyPenalties;

public class Biathlon {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\Cezar Marius\\Desktop\\Curs Programare\\02_Bazele java Development\\Homework\\src\\main\\resources\\standings.txt";

        Path path1 = Paths.get(source);
        List<BiathlonPlayer> playerList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path1)));
            while ((source = br.readLine()) != null) {
                String[] values = source.split(",");

                BiathlonPlayer player = BiathlonPlayer.mapLineToSkier(source);
                playerList.add(player);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<BiathlonPlayer> skiersList = Files.lines(path1)
                .map(line -> mapLineToSkier(line))
                .collect(Collectors.toList());
        skiersList.forEach(BiathlonPlayer -> BiathlonPlayer.applyPenalties(BiathlonPlayer));
        skiersList.sort(Comparator.comparing(skier -> skier.getResultTime()));
        System.out.println(skiersList);
//        skiersList.forEach(BiathlonPlayer-> BiathlonPlayer.getResultTime().minusSeconds(BiathlonPlayer.applyPenalties();));

    }

}
