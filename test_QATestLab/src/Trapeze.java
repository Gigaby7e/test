public class Trapeze extends Figure {
    private int minBasis;
    private int maxBasis;
    private int rib;
    private double height;
    private String color;

    public Trapeze(int minBasis, int maxBasis, int height, String color) {
        if (minBasis > maxBasis) {
            int tmp = minBasis;
            minBasis = maxBasis;
            maxBasis = tmp;
        }

        this.minBasis = minBasis;
        this.maxBasis = maxBasis;
        this.height = height;
        this.color = color;
    }

    private double getRib() {
        int tmpRib = (maxBasis - minBasis) / 2;
        return Math.sqrt(Math.pow(height, 2) + Math.pow(tmpRib, 2));
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: " + draw() + "; Площа: " + Math.round(getArea()) + "; Бічна сторона: " + Math.round(getRib()) + "; Колір: " + getColor());
    }

    @Override
    public String draw() {
        return "Трапеція";
    }

    @Override
    public double getArea() {
        return ((minBasis + maxBasis) / 2) * height;
    }

    @Override
    public String getColor() {
        return color;
    }
}
