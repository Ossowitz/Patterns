package stategy;

public class Auto {
    protected FillStrategy fillStrategy;

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Едем вперёд!");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

}
