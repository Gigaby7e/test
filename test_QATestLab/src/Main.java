import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Figure> figureList = new ArrayList<Figure>();
        String[] colors = {"Червоний", "Оранжевий", "Зелений", "Жовтий", "Синій", "Голубий", "Фіолетовий"};

        int number = random.nextInt(100);
        while (number != 0) {
            switch (random.nextInt(4)) {
                case 0:
                    int rib = random.nextInt(100);
                    String color = colors[random.nextInt(colors.length)];
                    Figure square = new Square(rib, color);
                    figureList.add(square);
                    break;
                case 1:
                    int radius = random.nextInt(100);
                    color = colors[random.nextInt(colors.length)];
                    Figure circle = new Circle(radius, color);
                    figureList.add(circle);
                    break;
                case 2:
                    rib = random.nextInt(100);
                    int rib2 = random.nextInt(100);
                    int angle = random.nextInt(90);
                    color = colors[random.nextInt(colors.length)];
                    Figure triangle = new Triangle(rib, rib2, angle, color);
                    figureList.add(triangle);
                    break;
                case 3:
                    int minBasis = random.nextInt(100);
                    int maxBasis = random.nextInt(100);
                    int height = random.nextInt(50);
                    color = colors[random.nextInt(colors.length)];
                    Figure trapeze = new Trapeze(minBasis, maxBasis, height,  color);
                    figureList.add(trapeze);
                    break;
            }

            number--;
        }

        for (Figure item : figureList) {
            item.displayInfo();
        }
    }
}
