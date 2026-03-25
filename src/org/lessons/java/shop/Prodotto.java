package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Random;


public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    public Prodotto (String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal getPrezzoBase(){
        return this.prezzo;
    }

    public BigDecimal getPrezzoConIva(){
        
        return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        // aggiungi al prezzo (che è senza iva, netto)
        // il prezzo dell'iva (per esempio prezzo base*iva, 
        // che sarà un decimale tipo 0.22, ovvero il 22%).
        // poi arrotonda a 2 decimali, per difetto(verso il basso/DOWN)

    }
}
