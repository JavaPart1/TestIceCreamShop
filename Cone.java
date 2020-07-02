package be.intecbrussel.eatables;

public class Cone implements Eatable{
    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor balls[]) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        // Geen implementaties voor al de eat() methodes?...
    }
}
