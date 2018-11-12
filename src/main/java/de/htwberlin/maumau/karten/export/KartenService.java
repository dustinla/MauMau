package de.htwberlin.maumau.karten.export;

import de.htwberlin.maumau.karten.entity.Farbe;
import de.htwberlin.maumau.karten.entity.Karte;
import de.htwberlin.maumau.spiel.entity.Spiel;
import de.htwberlin.maumau.spieler.entity.Spieler;

import java.util.List;

public interface KartenService {


    /**
     * Diese Methode baut den Ablagestapel aus neuen Karten des ausgewaehlten Kartendecks auf.
     * Im Anschluss wird der Stapel gemischt und dann erst ausgeteilt.
     *
     * @param spiel - Das zu spielende Spiel.
     */
    Spiel anlegenKartenstapel(Spiel spiel);

    /**
     * Diese Methode mischt den Ziehstapel einmalig durch.
     *
     * @param spiel              - Das Spiel, dessen Kartenstapel gemischt werden soll.
     * @param obersteKarteBleibt - boolean, der angibt, dass die oberste Karte des Ablagestapels bleibt.
     */
    List<Karte> mischenKartenstapel(List<Karte> karten, boolean obersteKarteBleibt);

    /**
     * Diese Methode entscheidet welche Karte, ruft den Spieler auf und übergibt diese ihm
     *
     * @param kartenDeck
     * @param spieler
     * @return
     */
    List austeilenvonKarten(List<Karte> kartenDeck, Spieler spieler);

    Karte erstellenNeuerKarte(Farbe farbe, String wert);
}
