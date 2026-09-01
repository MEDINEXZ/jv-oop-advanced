package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

public class FigureSupplier {
    private static final double DEFAULT_SIZE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private final Supplier<Figure>[] figureSuppliers = new Supplier[] {
            () -> new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * DEFAULT_SIZE
            ),
            () -> new Square(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * DEFAULT_SIZE
            ),
            () -> new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * DEFAULT_SIZE,
                    random.nextDouble() * DEFAULT_SIZE
            ),

            () -> new RightTriangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * DEFAULT_SIZE,
                    random.nextDouble() * DEFAULT_SIZE
            ),

            () -> new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * DEFAULT_SIZE,
                    random.nextDouble() * DEFAULT_SIZE,
                    random.nextDouble() * DEFAULT_SIZE
            )
    };

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(figureSuppliers.length);

        return figureSuppliers[randomIndex].get();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_SIZE);
    }
}
