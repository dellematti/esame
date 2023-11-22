import ca.mcgill.cs.stg.solitaire.cards.Card;

public class StrategiaBriscolaGiocatore2 implements Strategia {
    final private Strategia next;

    public StrategiaBriscolaGiocatore2(Strategia next) {
        this.next = next;
    }
    @Override
    public Card scegliCarta() {

        return null;
    }
}
