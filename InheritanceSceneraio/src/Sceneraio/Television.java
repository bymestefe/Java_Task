package Sceneraio;

import java.util.ArrayList;

public class Television {

    private boolean standBy;
    private int volume;
    private ArrayList<Channel> channels;
    private int currentVolumeLevel;

    public Television(){
        this.standBy = false; 
        this.volume = 0;
        this.channels = new ArrayList<Channel>();
    }


    public void addChannel(Channel c){
        if(this.getChannels().contains(c) == false){
            this.getChannels().add(c);
        }
    }

    public void addChannel(Channel[] c){
        for(int i = 0; i<=c.length - 1; i++){
            this.addChannel(c[i]);
        }
    }

    public void removeChannel(Channel c){
        if(this.getChannels().contains(c) == true){
            this.getChannels().remove(c);
        }
    }

    public void decV(){
        this.setVolume(this.volume-1);
    }
    public void incV(){
        this.setVolume(this.volume+1);
    }


    public boolean isStandBy() {
        return standBy;
    }

    public void setStandBy(boolean standBy) {
        this.standBy = standBy;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.currentVolumeLevel = this.volume; // önce sakla
        this.volume = volume; // sonra değiştir.

    }

    public void turnPrevious(){
        this.volume = this.currentVolumeLevel;
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }

}
