package trafficLight;

public class TrafficLight {
    private TrafficLightColor color;

    public TrafficLight(TrafficLightColor color) {
        setColor(color);
    }

    public TrafficLightColor getColor() {
        return color;
    }

    public void setColor(TrafficLightColor color) {
        this.color = color;
    }

}
