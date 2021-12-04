package Sceneraio;

public class TVChannel extends Channel {

    long symbol_rate;
    String polarization;

    public TVChannel(String name, long frequency, long symbol_rate, String polarization) {
        super(name, frequency);
        this.symbol_rate = symbol_rate;
        this.polarization = polarization;
    }

    public long getSymbol_rate() {
        return symbol_rate;
    }

    public void setSymbol_rate(long symbol_rate) {
        this.symbol_rate = symbol_rate;
    }

    public String getPolarization() {
        return polarization;
    }

    public void setPolarization(String polarization) {
        this.polarization = polarization;
    }

    //method overriding


    @Override
    public String getInfo() {
        return super.getInfo() + "\nSymbol rate :" + this.getSymbol_rate() + " \npolarization :"+ this.getPolarization();
    }
}
