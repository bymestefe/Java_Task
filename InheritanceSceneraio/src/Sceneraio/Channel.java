package Sceneraio;

public class Channel {

    private String name;
    protected long frequency;

    public Channel(String name, long frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getInfo(){
        String info = "Channel name :" + this.getName() + " and its frequency is :"+this.getFrequency();
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }
}
