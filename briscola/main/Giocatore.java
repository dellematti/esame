import ca.mcgill.cs.stg.solitaire.cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Giocatore {

    private final List<Card> carteMano;

    private final Strategia strategia;


    private final List<Card> mazzettoPrese;


    public Giocatore(Strategia strategia) {
        this.strategia = strategia;
        carteMano = new ArrayList<>();
        mazzettoPrese = new ArrayList<>();
    }



    public void addCarta (Card carta){
        carteMano.add(carta);
    }


    public Card turno() {
        return strategia.scegliCarta();
    }



    // devo mettere o questa classe come inner di Briscola, oppure i mazzetti ce li deve avere Briscola
    public void addMazzetto(Card carta) {
        mazzettoPrese.add(carta);
    }



}
