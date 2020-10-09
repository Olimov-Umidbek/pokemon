package ru.ifmo.pokemons.croagunk.move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

/**
 * @see ru.ifmo.se.pokemon.PhysicalMove
 */
public class Bulldoze extends PhysicalMove {

    private final Stat stat;
    private final int speed;

    /**
     * Constructor
     * @param type
     * @param v
     * @param v1
     * @param stat
     * @param speed
     */
    public Bulldoze(Type type, double v, double v1, Stat stat, int speed) {
        super(type, v, v1);

        this.stat = stat;
        this.speed = speed;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(stat, speed);
    }
}
