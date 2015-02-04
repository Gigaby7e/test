public class Triangle extends Figure {
    private int rib;
    private int rib2;
    private int angle;
    private String color;

    public Triangle(int rib, int rib2, int angle, String color) {
        this.rib = rib;
        this.rib2 = rib2;
        this.angle = angle;
        this.color = color;
    }

    private double getHypotenuse() {
        return Math.sqrt(Math.pow(rib, 2) + Math.pow(rib2, 2) - 2 * rib * rib2 * Math.cos(angle));
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: " + draw() + "; Площа: " + Math.round(getArea()) + "; Гіпотенуза: " + Math.round(getHypotenuse()) + "; Колір: " + getColor());
    }

    @Override
    public String draw() {
        return "Трикутник";
    }

    @Override
    public double getArea() {
        double p = (rib + rib2 + getHypotenuse()) / 2;
        return Math.sqrt(p * (p - rib) * (p - rib2) * (p - getHypotenuse()));
    }

    @Override
    public String getColor() {
        return color;
    }
}
