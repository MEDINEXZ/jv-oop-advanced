package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase,
                              double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + ", "
                + "side height: " + getFirstBase()
                + ", side width: " + getSecondBase()
                + ", height: " + getHeight()
                + ", " + "color: " + getColor());
    }
}
