package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Random;


public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto (String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    // codice prodotto solo in lettura (getter)
    public int getCodice(){
        return this.codice;
    } 
    // getter & setter (lettura e scrittura)
    public String getNome(){
        return this.nome;
    }
     public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescrizione(){
        return this.descrizione;
    }
     public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    
    public String getIva(){
        // qui uso string perché non restituirò un numero, 
        // ma una stringa per leggere meglio l'iva
        return this.iva.multiply(new BigDecimal(100)) + "%";
    }

    public void setIva(BigDecimal iva){
        this.iva = iva;
    }
    


    public BigDecimal getPrezzoBase(){
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo){
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzoConIva(){
        
        return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        // aggiungi al prezzo (che è senza iva, netto)
        // il prezzo dell'iva (per esempio prezzo base*iva, 
        // che sarà un decimale tipo 0.22, ovvero il 22%).
        // poi arrotonda a 2 decimali, per difetto(verso il basso/DOWN)

    }

    public String getNomeEsteso(){
        return codice + "-" + nome;
    }
}
