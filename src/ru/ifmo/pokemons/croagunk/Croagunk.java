package ru.ifmo.pokemons.croagunk;

import ru.ifmo.pokemons.croagunk.move.Bulldoze;
import ru.ifmo.pokemons.croagunk.move.Facade;
import ru.ifmo.pokemons.croagunk.move.Flatter;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Croagunk extends Pokemon {

    public Croagunk(String name, int level) {
        super(name, level);

        setStats(48, 61, 40, 61, 40, 50);
        setType(Type.POISON, Type.FIGHTING);
        setMove(
                new Flatter(Type.DARK, 0, 1.0),
                new Facade(Type.NORMAL, 70, 1.0),
                new Bulldoze(Type.GROUND, 60, 1.0, Stat.SPEED, -1)
        );
    }
}
