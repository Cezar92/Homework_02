package Homework_08;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Object Transaction;

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Camridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambidge");

        Transaction transaction1 = new Transaction(1000, 2021, raoul);
        Transaction transaction2 = new Transaction(1500, 2021, mario);
        Transaction transaction3 = new Transaction(100, 2020, alan);
        Transaction transaction5 = new Transaction(1200, 2021, brian);
        Transaction transaction4 = new Transaction(1200, 2021, raoul);
        Transaction transaction6 = new Transaction(1300, 2021, brian);

        Transaction[] transaction = {transaction1, transaction2, transaction3, transaction4, transaction5, transaction6};

//        Return a string of all traders names sorted alphabetically.
        List<Trader> traderList = Arrays.asList(raoul, mario, alan, brian);
        String treaderString = traderList
                .stream()
                .map(p -> p.getName())
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(treaderString);

//        Are any traders based in Milan?
        boolean milanTrader = traderList.stream()
                .allMatch(elem -> elem.getCity().matches("Milan"));
        System.out.println(milanTrader);

        // 6 Print all transactions values from the traders living in Cambridge.
        System.out.println("Transactions values from the traders living in Cambridge \n");
        Stream.of(transaction)
                .filter(elem -> elem.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.toList())
                .forEach(elem -> {
                    elem.getValue();
                    System.out.println(elem.getValue());
                });
        System.out.println("---------------------------------");

////         7 Whats the highest value of all the transactions?
//        System.out.println("The highest value of all the transactions \n");
//        Integer maxim = Stream.of(transaction)
//                .sorted(Comparator.comparing(Transaction::getvalue))
//                .mapToInt(Transaction::getvalue)
//                .max().getAsInt();
//        System.out.println(maxim);
//        System.out.println("---------------------------------");
//
//        //8 Find the transaction with the smallest value.
//        System.out.println("The transaction with the smallest value \n");
//        Optional<Transaction> r =
//                Stream.of(transaction)
//                        .min(Comparator.comparing(Transaction::getvalue));
//        System.out.println(r);
//
//        System.out.println("---------------------------------");
//
//
    }
}
