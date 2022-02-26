package com.oguzhan;

public class Runner {
    public static void main(String[] args) {
        BuyukbasIsci buyukbasIsci = new BuyukbasIsci();
        buyukbasIsci.hayvanlarıBesle();
        KucukbasIsci kucukbasIsci = new KucukbasIsci();
        kucukbasIsci.hayvanlarıBesle();
        KumesIsci kumesIsci = new KumesIsci();
        kumesIsci.hayvanlarıBesle();
        //**********************************------------*******************************
        Aga aga;
        aga = new BuyukbasIsci();
        aga.hayvanlarıBesle();
        aga = new KucukbasIsci();
        aga.hayvanlarıBesle();
        aga = new KumesIsci();
        aga.hayvanlarıBesle();

    }
}
