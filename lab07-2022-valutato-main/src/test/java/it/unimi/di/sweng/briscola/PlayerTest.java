package it.unimi.di.sweng.briscola;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class PlayerTest {



    @Test
    void iterableTest() {
        Player player = new Player("Jhonnu");
        player.giveCard(Card.get(Rank.SETTE, Suit.COPPE));
        player.giveCard(Card.get(Rank.SEI, Suit.COPPE));
        player.giveCard(Card.get(Rank.CAVALLO, Suit.COPPE));
        Iterator<Card> it = player.iterator();

        assertThat(it.next()).isEqualTo(Card.get(Rank.SETTE, Suit.COPPE));
        assertThat(it.next()).isEqualTo(Card.get(Rank.SEI, Suit.COPPE));
        assertThat(it.next()).isEqualTo(Card.get(Rank.CAVALLO, Suit.COPPE));
    }




    @Test
    void comparableTestMaggiore() {
        Player player1 = new Player("Uno");
        Player player2 = new Player("Due");
        player1.addWonCardsToPersonalDeck(Card.get(Rank.SETTE, Suit.BASTONI), Card.get(Rank.SETTE, Suit.COPPE));
        player2.addWonCardsToPersonalDeck(Card.get(Rank.TRE, Suit.BASTONI), Card.get(Rank.SETTE, Suit.COPPE));
        assertThat(player1.compareTo(player2)).isLessThan(0);
        // provare con il costruttore mockato


    }

    @Test
    void comparableTestMinore() {
        Player player1 = new Player("Uno");
        Player player2 = new Player("Due");
        player1.addWonCardsToPersonalDeck(Card.get(Rank.SETTE, Suit.BASTONI), Card.get(Rank.SETTE, Suit.COPPE));
        player2.addWonCardsToPersonalDeck(Card.get(Rank.TRE, Suit.BASTONI), Card.get(Rank.SETTE, Suit.COPPE));
        assertThat(player2.compareTo(player1)).isGreaterThan(0);
        // provare con il costruttore mockato


    }


    @Test
    void comparableTestUguale() {
        Player player1 = new Player("Uno");
        Player player2 = new Player("Due");
        player1.addWonCardsToPersonalDeck(Card.get(Rank.SETTE, Suit.BASTONI), Card.get(Rank.SETTE, Suit.COPPE));
        player2.addWonCardsToPersonalDeck(Card.get(Rank.SETTE, Suit.BASTONI), Card.get(Rank.SETTE, Suit.COPPE));
        assertThat(player2.compareTo(player1)).isEqualTo(0);
        // provare con il costruttore mockato
    }


}
