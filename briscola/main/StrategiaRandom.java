import ca.mcgill.cs.stg.solitaire.cards.Card;

public class StrategiaRandom implements Strategia {
    final private Strategia next;

    public StrategiaRandom(Strategia next) {
        this.next = next;
    }
    @Override
    public Card scegliCarta() {

        return null;
    }
}
