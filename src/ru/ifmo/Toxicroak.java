package ru.ifmo;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Toxicroak extends Croagunk {
    public Toxicroak(String name, int lvl) {
        super(name, lvl);
        setStats(83, 106, 65, 86, 65, 85);
        setType(Type.POISON, Type.FIGHTING);
        setMove(new Flatter(), new Facade(), new Bulldoze(), new SwordsDance());
    }
}

class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 1.0);
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, +2);
    }
}