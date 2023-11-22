package it.unimi.di.sweng.blackjack;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Deck;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiMazzo implements DeckInterface  {

  List<Deck> multiMazzo;


  public MultiMazzo(int numMazzi) {
    multiMazzo = new ArrayList<Deck>();
    for (int i = 0; i < numMazzi; i++) {
      multiMazzo.add(new Deck());
      multiMazzo.get(i).shuffle();
    }
    Collections.shuffle(multiMazzo);
  }

  @Override
  public @NotNull Card draw() {
    for (Deck deck:multiMazzo ) {
      if (!deck.isEmpty())
        return deck.draw();
    }
    throw new IllegalStateException("Non si può pescare dal mazzo vuoto");
  }

  @Override
  public boolean isEmpty() {
    return this.size() == 0;
  }

  public int size() {
    int numeroCarte = 0;
    for (Deck deck:multiMazzo ) {
      numeroCarte += deck.size();
    }
    return numeroCarte;
  }


}
