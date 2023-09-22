package trafficLight;

import java.util.Random;

public class TestTrafficLight {
    public static void main(String[] args) {
        new TestTrafficLight().run();
    }

    private void run() {
        Random random = new Random();
        TrafficLight red = new TrafficLight(TrafficLightColor.RED);
        TrafficLight yellow = new TrafficLight(TrafficLightColor.YELLOW);
        TrafficLight green = new TrafficLight(TrafficLightColor.GREEN);

        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0 -> System.out.println(red.getColor());
            case 1 -> System.out.println(yellow.getColor());
            case 2 -> System.out.println(green.getColor());
        }
    }
}
