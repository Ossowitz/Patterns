import stategy.Auto;
import stategy.F1Car;
import stategy.Hybrid;
import stategy.Sedan;

public class Main {

    public static void main(String[] args) {
        Auto sedan = new Sedan();
        Auto hybrid = new Hybrid();
        Auto f1car = new F1Car();

        sedan.fill();
        hybrid.fill();
        f1car.fill();
    }
}
