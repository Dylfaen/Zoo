import formes.Rectangle;

import java.awt.geom.Point2D;

public class TestForme {
    public static void main(String[] args) {
        Point2D.Double lol = new Point2D.Double(2.0, 3.0);
        Rectangle rect = new Rectangle(lol, 20, 30);
        System.out.println(rect);


        Rectangle rect2 = new Rectangle(new Point2D.Double(2.0, 3.0), 20, 30);
        System.out.println(rect2);

        Rectangle rect3 = new Rectangle(new Point2D.Double(2.0, 3.0), 30, 20);
        System.out.println(rect3);

        System.out.println(rect.equals(rect2));
        System.out.println(rect3.equals(rect2));




    }
}