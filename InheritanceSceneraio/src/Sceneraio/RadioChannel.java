package Sceneraio;

public class RadioChannel extends Channel {

    private String type;


    public RadioChannel(String name, long frequency, String type) {
        super(name, frequency);
        this.type  = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
