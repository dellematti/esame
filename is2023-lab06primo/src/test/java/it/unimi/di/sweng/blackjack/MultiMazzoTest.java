package it.unimi.di.sweng.blackjack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;


import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class MultiMazzoTest {


    @ParameterizedTest
    @CsvSource({
            "1,52",
            "1,52"
    })
    void multiMazzoSizeTest(int numeroMazzi, int numeroCarteAttese) {
        MultiMazzo mazzo = new MultiMazzo(numeroMazzi);
        assertThat(mazzo.size()).isEqualTo(numeroCarteAttese);
    }

    @ParameterizedTest
    @CsvSource({
            "1",
            "12"
    })
    void multiMazzoDrawTest(int carteDaPescare) {
        MultiMazzo mazzo = new MultiMazzo(1);
        for (int i = 0; i < carteDaPescare; i++) {
            mazzo.draw();
        }
        assertThat(mazzo.size()).isEqualTo(52- carteDaPescare);
    }


    @Test
    void multiMazzoEmptyTest() {
        MultiMazzo mazzo = new MultiMazzo(1);
        for (int i = 0; i < 52; i++)
            mazzo.draw();
        assertThat(mazzo.isEmpty()).isTrue();
    }





}