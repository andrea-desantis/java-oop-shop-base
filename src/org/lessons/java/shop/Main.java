package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Prodotto pane = new Prodotto(
        "pane", 
        "ottosemi", 
        new BigDecimal(1), 
        new BigDecimal(0.22)
    );

    Prodotto cioccolato = new Prodotto(
        "cioccolato", 
        "al latte", 
        new BigDecimal(3.50), 
        new BigDecimal(0.22)
    );

    System.out.println(pane.getPrezzoBase());
    System.out.println(cioccolato.getPrezzoBase());

    System.out.println(pane.getPrezzoConIva());
    System.out.println(cioccolato.getPrezzoConIva());

    System.out.println(pane.getNomeEsteso());
    System.out.println(cioccolato.getNomeEsteso());
    }
    



}
