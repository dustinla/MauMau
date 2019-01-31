package de.htwberlin.maumau.spieler.impl;

import de.htwberlin.maumau.karten.entity.Karte;
import de.htwberlin.maumau.spieler.entity.Spieler;
import de.htwberlin.maumau.spieler.export.KiService;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Random;


public class KiServiceImpl implements KiService {
    private static Logger log = Logger.getRootLogger();


    private int kiZaehler=1;

    @Override
    public Karte kiWaehltKarte(Spieler spieler, int durchgangszaehler) {
        log.debug("KiServiceImpl - kiWaehltKarte");
        Karte moeglicheKarte = null;
        List<Karte> handkarten = spieler.getHandkarten();

        moeglicheKarte=handkarten.get(durchgangszaehler);
        return moeglicheKarte;
    }

    @Override
    public boolean mauSetzen(Spieler spieler) {
        log.debug("KiServiceImpl - mauSetzen");
        if(spieler.getHandkarten().size()==1){
            Random rand = new Random();
            int randomNum = rand.nextInt((10 - 0) + 1) + 0;

            return randomNum > 3;
        }
        return false;
    }

    @Override
    public String kiAnlegen() {
        log.debug("KiServiceImpl - kiAnlegen");
        String spielername = "Computer"+kiZaehler;
        kiZaehler++;
        return spielername;
    }
}