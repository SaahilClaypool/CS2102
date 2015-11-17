/**
 * Created by Saahil on 11/4/2015.
 */
import tester.*;
public class Examples {
    FrogSpell frog = new FrogSpell("Prince");
    PrinceKiss prince = new PrinceKiss("Prince");
    public boolean testFrogSpell(Tester t)
    {
       return t.checkExpect(frog.spellCast().equals(prince), true);
    }
    public boolean testPrinceKiss(Tester t)
    {
        return t.checkExpect(prince.kiss().equals(new PrinceKiss("Prince")));
    }
}
