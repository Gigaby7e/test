public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: " + draw() + "; Площа: " + Math.round(getArea()) + "; Радіус: " + getRadius() + "; Колір: " + getColor());
    }

    @Override
    public String draw() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getColor() {
        return color;
    }
}
