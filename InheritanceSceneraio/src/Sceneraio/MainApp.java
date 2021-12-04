package Sceneraio;

public class MainApp {
    public static void main(String[] args) {
        TVChannel ntv = new TVChannel("NTV",12015,27500,"H");
        TVChannel cnn = new TVChannel("CNN",12121,27500,"H");
        RadioChannel powerFm = new RadioChannel("Power FM",100,"POP");
        RadioChannel alemFm = new RadioChannel("Alem FM",89,"TURKISH-POP");

        Channel[] newChannels = {ntv,cnn,powerFm,alemFm}; // farklı tipte nesneleri saklayabiliriz inheritance ile..
        Television tv = new Television();

        tv.addChannel(newChannels);

        RemoteController rc = new RemoteController(tv);

        //rc.power();

        rc.displayChannels(); //tüm kanalları listeleme

        rc.gotoChannel(1); // izlemek istediğiniz kanalı görüntüleme



    }
}
