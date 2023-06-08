package stategy;

public class F1PitStopStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
    }
}
