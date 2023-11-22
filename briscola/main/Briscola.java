import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Deck;

import java.util.ArrayList;
import java.util.List;



// costruirò la partita passandogli i giocatori, e chiamerò i metodi per la partita

public class Briscola {

    private final Deck mazzo;
    private final Card briscola;
    private final List<Giocatore> giocatori;
    private final List<Card> carteTerra;

    public Briscola(List<Giocatore> giocatoriInput ) {
        giocatori = new ArrayList<>();
        for (Giocatore g : giocatoriInput)
            giocatori.add(g);

        carteTerra = new ArrayList<>();
        mazzo = new Deck();
        briscola = mazzo.draw();
    }


    public void daiCarte() {
        for (Giocatore giocatore : giocatori )
            giocatore.addCarta(mazzo.draw());
    }



    public void turno() {
        Card cartaGiocata;
        for (Giocatore giocatore : giocatori ) {
            cartaGiocata = giocatore.turno();
            carteTerra.add(cartaGiocata);
        }
        int giocatoreVincente = stabilisciVincitoreTurno();
        for (Card cartaTerra: carteTerra )
            giocatori.get(giocatoreVincente).addMazzetto(cartaTerra);
        carteTerra.clear();
    }

    private int stabilisciVincitoreTurno() {
        Card cartaGiocatore1 = carteTerra.get(0);
        Card cartaGiocatore2 = carteTerra.get(1);
        if ( isBriscola(cartaGiocatore1) && ! isBriscola(cartaGiocatore2) ) return 0;
        if (! isBriscola(cartaGiocatore1) && isBriscola(cartaGiocatore2)  ) return 1;
        if(cartaGiocatore1.getSuit() != cartaGiocatore2.getSuit()) return 0;

        if (cartaGiocatore1.getRank().points() > cartaGiocatore2.getRank().points()) return 0;
        else return 1;
    }


    private boolean isBriscola(Card carta) {
        if (carta.getRank().equals(briscola.getRank())) return true;
        return false;
    }




}
