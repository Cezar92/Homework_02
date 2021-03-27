package Quizz;

public class DeliveryThread implements Runnable {
    private String adress;
    private String dateToDeliv;
    private long distTime;

    public DeliveryThread(String adress, String dateToDeliv, long distanceToTime) {
        this.adress = adress;
        this.dateToDeliv = dateToDeliv;
        this.distTime = distanceToTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(distTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
