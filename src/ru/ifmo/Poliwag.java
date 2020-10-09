package ru.ifmo;

import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon {

    public Poliwag(String name, int lvl) {
        super(name, lvl);
        setStats(83, 106, 65, 86, 65, 85);
        setType(Type.WATER);
        setMove(new Rest(), new Swagger());
    }
}

class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }

    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, +2);
    }
}