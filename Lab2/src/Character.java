import tester.Tester;

//FACTORY PATTERN
abstract class Character {
    String name;
    String getName() {
        return name;
    }
}

class Prince extends Character {
    Prince (String name) {
        this.name = name;
    }
}

class Princess extends Character {
    Princess (String name) {
        this.name = name;
    }
}


class Frog extends Character {
    Frog (String name) {
        this.name = name;
    }
}
class Witch extends Character {
    Witch (String name)
    {
        this.name = name;
    }


}

//---------------------
interface kissable
{
    Character kiss();
}
class WitchKiss extends Witch implements kissable{
    WitchKiss (String name )
    {
        super(name);
    }
    public Character kiss ()
    {
        return this;
    }

}

class PrinceKiss extends Prince implements kissable{
    PrinceKiss (String name )
    {
        super(name);
    }
    public Character kiss ()
    {
        return this;
    }

}
class PrincessKiss extends Princess implements kissable{
    PrincessKiss (String name )
    {
        super(name);
    }
    public Character kiss ()
    {
        return this;
    }

}

class FrogKiss extends Frog implements kissable{
    FrogKiss (String name )
    {
        super(name);
    }
    public Character kiss ()
    {
        return new Prince(this.getName());
    }

}
//-------------------------------------------
interface spellcast{
    Character spellCast();

}
class FrogSpell extends FrogKiss implements spellcast{
    FrogSpell(String name)
    {
        super(name);
    }

    @Override
    public Character spellCast() {
        return kiss();
    }
}
class PrinceSpell extends PrinceKiss implements spellcast{
    PrinceSpell(String name)
    {
        super(name);
    }

    @Override
    public Character spellCast() {
        return this;
    }
}
class PrincessSpell extends PrincessKiss implements spellcast{
    PrincessSpell(String name)
    {
        super(name);
    }

    @Override
    public Character spellCast() {
        return this;
    }
}
class WitchSpell extends WitchKiss implements spellcast{
    WitchSpell(String name)
    {
        super(name);
    }

    @Override
    public Character spellCast() {
        return this;
    }
}
class main{
    public static void main (String[] args)
    {
        Examples e = new Examples();
        Tester.run(e);
        Witch w = new Witch ("witch");
    }
}
