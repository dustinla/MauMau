/**
 * @author Joerg Lehmann, Christian Fiebelkorn, Dustin Lange
 * @version 20181113
 */

package de.htwberlin.maumau.spielverwaltung.entity;

import de.htwberlin.maumau.kartenverwaltung.entity.Farbe;
import de.htwberlin.maumau.kartenverwaltung.entity.Karte;
import de.htwberlin.maumau.spielerverwaltung.entity.Spieler;

import java.util.ArrayList;
import java.util.List;


public class Spiel {

    private Spieler aktiverSpieler;
    private boolean istSpielrichtungRechts = true;
    private int summeZuziehendeKarten;
    private List<Karte> ablagestapelkarten = new ArrayList<>();
    private List<Karte> ziehstapelkarten = new ArrayList<>();
    private List<Spieler> spielerDesSpieles = new ArrayList<>();
    private Farbe farbe;
    private boolean mussFarbeWuenschen = false;
    private boolean erfolgreichgelegt;
    private boolean aussetzen = false;

    public boolean isAussetzen() {
        return aussetzen;
    }

    public void setAussetzen(boolean aussetzen) {
        this.aussetzen = aussetzen;
    }

    public boolean isErfolgreichgelegt() {
        return erfolgreichgelegt;
    }

    public void setErfolgreichgelegt(boolean erfolgreichgelegt) {
        this.erfolgreichgelegt = erfolgreichgelegt;
    }

    public boolean isMussFarbeWuenschen() {
        return mussFarbeWuenschen;
    }

    public void setMussFarbeWuenschen(boolean mussFarbeWuenschen) {
        this.mussFarbeWuenschen = mussFarbeWuenschen;
    }

    public Spieler getAktiverSpieler() {
        return aktiverSpieler;
    }

    public void setAktiverSpieler(Spieler aktiverSpieler) {
        this.aktiverSpieler = aktiverSpieler;
    }

    public boolean isIstSpielrichtungRechts() {
        return istSpielrichtungRechts;
    }

    public void setIstSpielrichtungRechts(boolean istSpielrichtungRechts) {
        this.istSpielrichtungRechts = istSpielrichtungRechts;
    }

    public int getSummeZuziehendeKarten() {
        return summeZuziehendeKarten;
    }

    public void setSummeZuziehendeKarten(int summeZuziehendeKarten) {
        this.summeZuziehendeKarten = summeZuziehendeKarten;
    }

    public List<Karte> getAblagestapelkarten() {
        return ablagestapelkarten;
    }

    public void setAblagestapelkarten(List<Karte> ablagestapelkarten) {
        this.ablagestapelkarten = ablagestapelkarten;
    }

    public List<Karte> getZiehstapelkarten() {
        return ziehstapelkarten;
    }

    public void setZiehstapelkarten(List<Karte> ziehstapelkarten) {
        this.ziehstapelkarten = ziehstapelkarten;
    }

    public List<Spieler> getSpielerDesSpieles() {
        return spielerDesSpieles;
    }

    public void setSpielerDesSpieles(List<Spieler> spielerDesSpieles) {
        this.spielerDesSpieles = spielerDesSpieles;
    }


    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }
}