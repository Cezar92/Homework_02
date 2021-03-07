package Homework_09;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        FestivalGate festivalGate = new FestivalGate();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(festivalGate);
        festivalStatisticsThread.start();

        for (int i = 0 ; i < 500 ; i++){
            TicketType random = TicketType.generateRandomTickets();
            FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(random, festivalGate);
            Thread att = new Thread(festivalAttendeeThread);
            att.start();
            Thread.sleep(50);
        }




    }
}
