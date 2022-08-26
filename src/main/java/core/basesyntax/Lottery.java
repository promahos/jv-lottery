package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}