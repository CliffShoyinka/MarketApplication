package main.java.entities.conretes;

import main.java.entities.abstracts.EntityBase;
import main.java.entities.abstracts.Test;

public class Beverages extends EntityBase implements Test {

    public int box;

    public int deposition;

    public String materiel;

    @Override
    public double kdvHesapla(double price) { return super.kdvHesapla(1.08);}

    @Override
    public double otvHesapla(double price) {

        price *=1.21;
        return price;
    }
}
