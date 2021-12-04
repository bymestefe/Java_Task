package Sceneraio;

import java.util.ArrayList;

public class RemoteController {

    private Television gadget;

    public RemoteController(Television gadget){
        this.gadget = gadget;
    }

    public Television getGadget() {
        return gadget;
    }

    public void setGadget(Television gadget) {
        this.gadget = gadget;
    }





    public void power(){
        //if the tv is open, close it...

        if(this.getGadget().isStandBy() == true){
            this.getGadget().setStandBy(false);
            //else open it..
        }else{
            this.getGadget().setStandBy(true);
        }
    }

    public void mute(){
        if(this.getGadget().getVolume() != 0){
            this.getGadget().setVolume(0);
        }else{
            this.getGadget().turnPrevious();
        }
    }

    public void gotoChannel(int number){
        int temp = number;
        if(temp < 0){
            temp = Math.abs(temp);
        }
        ArrayList <Channel> c = this.getGadget().getChannels();
        int numberOfChannels = c.size();

        if(numberOfChannels >temp){
            System.out.println(c.get(temp).getInfo());
        }else{
            System.out.println(c.get(1).getInfo());
        }
    }

    public void decVolume(){
        if(this.getGadget().getVolume()>0){
            this.getGadget().decV();
        }
    }

    public void incVolume(){
        if(this.getGadget().getVolume()<100){
            this.getGadget().incV();
        }
    }

    public void displayChannels(){
        int counter = 1;
        if(this.getGadget().isStandBy()){
            ArrayList<Channel> c = this.getGadget().getChannels();
            for(Channel channel: c){
                System.out.println(counter+"."+channel.getName());
                counter++;
            }
        }
    }
}
