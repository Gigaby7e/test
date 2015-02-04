public class Square extends Figure {
    private int rib;
    private String color;

    public Square(int rib, String color) {
        this.rib = rib;
        this.color = color;
    }

    public int getRib() {
        return rib;
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: " + draw() + "; Площа: " + Math.round(getArea()) + "; Сторона: " + getRib() + "; Колір: " + getColor());
    }

    @Override
    public String draw() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return Math.pow(rib, 2);
    }

    @Override
    public String getColor() {
        return color;
    }
}
