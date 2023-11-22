package it.unimi.di.sweng.blackjack;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mazziere implements GiocatoreBJ  {

    private MultiMazzo mazzo = new MultiMazzo(6);

    // mazziere avrà anche il metodo daiCarte, che verrà usato dagli sfidanti per carteIniziali

    final private List<Card> banco = new ArrayList<>();


    @Override
    public void carteIniziali() {
        banco.add(mazzo.draw());
        banco.add(mazzo.draw());
    }

    @Override
    public void gioca() {

    }

    @Override
    public Iterator<Card> getCards() {
        return banco.iterator();
    }

    @Override
    public @NotNull String getName() {
        return "banco";
    }
    // TODO i vari metodi richiesti per aderire all'interfaccia GiocatoreBJ
}
