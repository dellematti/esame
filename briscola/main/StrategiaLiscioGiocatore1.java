import ca.mcgill.cs.stg.solitaire.cards.Card;

public class StrategiaLiscioGiocatore1 implements Strategia {
    final private Strategia next;

    public StrategiaLiscioGiocatore1(Strategia next) {
        this.next = next;
    }
    @Override
    public Card scegliCarta() {
        // metto una carta non briscola bassa il più possibile
        return null;
    }










}
