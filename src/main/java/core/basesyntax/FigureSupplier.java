package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 10;
    private static final int FIGURE_TYPES_COUNT = 5;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        switch (figureType) {
            case 0:
                double radius = random.nextDouble() * MAX_SIZE;
                return new Circle(colorSupplier.getRandomColor(),
                        radius);

            case 1:
                double sideLength = random.nextDouble() * MAX_SIZE;
                return new Square(colorSupplier.getRandomColor(),
                        sideLength);

            case 2:
                double width = random.nextDouble() * MAX_SIZE;
                double height = random.nextDouble() * MAX_SIZE;
                return new Rectangle(colorSupplier.getRandomColor(),
                        width, height);

            case 3:
                double firstLeg = random.nextDouble() * MAX_SIZE;
                double secondLeg = random.nextDouble() * MAX_SIZE;
                return new RightTriangle(colorSupplier.getRandomColor(),
                        firstLeg, secondLeg);

            case 4:
                double firstBase = random.nextDouble() * MAX_SIZE;
                double secondBase = random.nextDouble() * MAX_SIZE;
                double trapezoidHeight = random.nextDouble() * MAX_SIZE;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        firstBase, secondBase, trapezoidHeight);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", MAX_SIZE);
    }
}
