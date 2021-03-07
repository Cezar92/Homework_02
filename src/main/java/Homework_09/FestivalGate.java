package Homework_09;
import lombok.Data;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Data
public class FestivalGate {

    private Queue<TicketType> attendeesQueue = new ConcurrentLinkedQueue<>();
}
