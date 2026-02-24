package Decorator;

interface Character {
    public String getAbilities();
}

class Mario implements Character {

    @Override
    public String getAbilities() {

        return "Mario";
    }

}

abstract class CharacterDeco implements Character {
    protected Character ch;

    public CharacterDeco(Character ch) {
        this.ch = ch;
    }

    public String getabilites() {
        return ch.getAbilities();
    }
}

class HeightUp extends CharacterDeco {

    HeightUp(Character c) {
        super(c);
    }

    @Override
    public String getAbilities() {

        return ch.getAbilities() + " with heightup";
    }

}

class GunPower extends CharacterDeco {

    GunPower(Character c) {
        super(c);
    }

    @Override
    public String getAbilities() {

        return ch.getAbilities() + " with Gun shots";
    }

}

class StarPower extends CharacterDeco {

    StarPower(Character c) {
        super(c);
    }

    @Override
    public String getAbilities() {

        return ch.getAbilities() + " with star power for limited time";
    }

}
public class Decorator{
    public static void main(String[] args) {
        Character mario= new Mario();
         System.out.println("Basic Character "+mario.getAbilities());

        mario=new HeightUp(mario);
        System.out.println("After Heightup "+mario.getAbilities());
        
        mario=new GunPower(mario);
        System.out.println("Agter gunPower "+mario.getAbilities());

        mario=new StarPower(mario);
        System.out.println("After StartPower up "+mario.getAbilities());
    }
}
