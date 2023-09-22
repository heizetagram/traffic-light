package trafficLight;

public class TrafficLight {
    private TrafficLightColor color;

    //Constructor
    public TrafficLight(TrafficLightColor color) {
        setColor(color);
    }

    //Getter
    public TrafficLightColor getColor() {
        return color;
    }

    //Setter
    public void setColor(TrafficLightColor color) {
        this.color = color;
    }

}
