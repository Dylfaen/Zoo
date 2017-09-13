package formes;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.concurrent.RecursiveAction;

public class Rectangle extends Forme {
    private double hauteur;
    private double largeur;


    public Rectangle(Point2D p, double hauteur, double largeur) {
        super(p);
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public double perimetre() {
        return 2 * (this.hauteur + this.largeur);
    }

    public double surface() {
        return this.hauteur * this.largeur;
    }


    public void placer(Point2D nouveauCentreGravite) {
        this.centreGravite().setLocation(nouveauCentreGravite);
    }

    public void translater(double dx, double dy) {
        this.centreGravite().setLocation(this.centreGravite().getX() + dx, this.centreGravite().getY() + dy);
    }

    public void changerHauteur(double nouvelleHauteur) {
        this.hauteur = nouvelleHauteur;
    }

    public void changerLargeur(double nouvelleLargeur) {
        this.largeur = nouvelleLargeur;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.hauteur, hauteur) != 0) return false;
        if (Double.compare(rectangle.largeur, largeur) != 0) return false;
        return this.centreGravite() != null ? this.centreGravite().equals(rectangle.centreGravite()) : rectangle.centreGravite() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(hauteur);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(largeur);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (this.centreGravite() != null ? this.centreGravite().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        super.toString();
        return "Rectangle{" +
                "hauteur=" + hauteur +
                ", largeur=" + largeur +
                '}';
    }
}
