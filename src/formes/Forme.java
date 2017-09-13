package formes;

import java.awt.geom.Point2D;

public abstract class Forme {

    private Point2D centreGravite;

    public Forme(Point2D centreGravite) {
        this.centreGravite = (Point2D.Double) centreGravite.clone();
    }

    public Point2D centreGravite() {
        return centreGravite;
    }

    @Override
    public String toString() {
        return "Forme{" +
                "centreGravite=" + centreGravite +
                '}';
    }
}
