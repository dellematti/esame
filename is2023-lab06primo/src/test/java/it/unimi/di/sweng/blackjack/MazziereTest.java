package it.unimi.di.sweng.blackjack;

import ca.mcgill.cs.stg.solitaire.cards.Card;
import ca.mcgill.cs.stg.solitaire.cards.Rank;
import ca.mcgill.cs.stg.solitaire.cards.Suit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class MazziereTest {


    @Test
    void nomeMazziereTest() {
        Mazziere mazziere = new Mazziere();
        assertThat(mazziere.getName()).isEqualTo("banco");
    }


    @Mock
    private MultiMazzo mazzoMockato;
    @InjectMocks
    private Mazziere mazziere;

    @Test
    void mazziereCarteInizialiTest() {
        when(mazzoMockato.draw()).thenReturn(Card.get(Rank.ACE, Suit.DIAMONDS), Card.get(Rank.EIGHT,Suit.HEARTS) );
        mazziere.carteIniziali();
        Iterator<Card> iteratorBanco = mazziere.getCards();
        assertThat(iteratorBanco.next()).isEqualTo(Card.get(Rank.ACE, Suit.DIAMONDS));
        assertThat(iteratorBanco.next()).isEqualTo(Card.get(Rank.EIGHT,Suit.HEARTS));
        //assertThatThrownBy(() -> iteratorBanco.next())
        assertThatThrownBy(iteratorBanco::next)
                .isInstanceOf(NoSuchElementException.class);
    }
    // con questo test testiamo anche il funzionamento dell iteratore (se volessi testare solo
    // l iteratore? però poi dovrei testare anche remove dell iteratore, o casi strani tipo
    // l iteratore su una lista vuota e testare next e hasNext



}
