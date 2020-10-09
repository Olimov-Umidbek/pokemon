package ru.ifmo.pokemons.croagunk.move;

import ru.ifmo.se.pokemon.*;

public class Flatter extends StatusMove {

    public Flatter(Type type, double v, double v1) {
        super(type, v, v1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.SPECIAL_ATTACK, +2);
    }
}
