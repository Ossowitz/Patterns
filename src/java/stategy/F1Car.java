package stategy;

import stategy.Auto;
import stategy.F1PitStopStrategy;

public class F1Car extends Auto {
    public F1Car() {
        this.fillStrategy = new F1PitStopStrategy();
    }
}
