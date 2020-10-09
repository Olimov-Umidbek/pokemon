package ru.ifmo;

import ru.ifmo.se.pokemon.Battle;

public class Battlefield {

	public static void main(String[] args) {

		Battle b = new Battle();

        b.addAlly(new Poliwrath("N", 1));
        b.addFoe(new Poliwhirl("G", 1));

        b.go();
    }
}