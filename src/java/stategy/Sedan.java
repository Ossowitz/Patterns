package stategy;

import stategy.Auto;

public class Sedan extends Auto {
    public Sedan() {
        this.fillStrategy = new StandardFillStrategy();
    }
}
