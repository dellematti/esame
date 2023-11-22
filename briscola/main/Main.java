import java.util.ArrayList;
import java.util.List;

public class Main {
    Strategia strategiaGiocatore1 = new StrategiaLiscioGiocatore1(
                                        new StrategiaRandom(
                                                null) );
    Strategia strategiaGiocatore2 = new StrategiaBriscolaGiocatore2(
                                        new StrategiaRandom(
                                                null) );


    Giocatore giocatore1 = new Giocatore(strategiaGiocatore1);
    Giocatore giocatore2 = new Giocatore(strategiaGiocatore2);

    List<Giocatore> giocatori = new ArrayList<>();
    giocatori.add(giocatore1);
    giocatori.add(giocatore2);


    Briscola partita = new Briscola(giocatori);


}
