package stategy;

import stategy.Auto;

public class Hybrid extends Auto {
    public Hybrid() {
        this.fillStrategy = new HybridFillStrategy();
    }
}
