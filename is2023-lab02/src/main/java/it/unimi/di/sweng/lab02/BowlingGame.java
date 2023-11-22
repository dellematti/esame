package it.unimi.di.sweng.lab02;

public class BowlingGame implements Bowling{

    private int punteggio;

    @Override
    public void roll(int pins) {
        punteggio+=pins;
    }

    @Override
    public int score() {
        return punteggio;
    }
}
