package it.unimi.di.sweng.briscola;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
public class BriscolaTest {

    @Mock Player g1;
    @Mock Player g2;
    @Mock Deck deck;
    // perchè deck così funziona se lo passo come input al costruttore di briscola??

    @ParameterizedTest
    @CsvSource({
            "1,g1",
            "-1,g2",
    })
    void gameWinnerTest(int comparation, String winner) {
        // posso fare direttamente così perchè il test che il giocatore sia comparable l ho fatto prima

        //Player g1 = mock(Player.class);
        //Player g2 = mock(Player.class); // fare questo, o dichiararle fuori con @Mock è uguale
        when(g1.getName()).thenReturn("g1");
        when(g2.getName()).thenReturn("g2");
        when(g1.compareTo(g2)).thenReturn(comparation);
        // in SUT non potevo fare @InjectMocks
        Briscola SUT = new Briscola(g1, g2, Deck.createFullDeck());
        assertThat(SUT.establishGameWinner().getName()).isEqualTo(winner);
    }
}






