package ru.ifmo.pokemons.croagunk.move;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade(Type type, double v, double v1) {
        super(type, v, v1);
    }

    protected void applyOppDamage(Pokemon p, double damage) {
        Status st = p.getCondition();
        if (st.equals(Status.BURN) || st.equals(Status.POISON) || st.equals(Status.PARALYZE)) {
            p.setMod(Stat.HP, (int) (Math.round(damage) * 2));
        }
    }
}
