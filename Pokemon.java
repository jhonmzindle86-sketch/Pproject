public class Pokemon {
    
    String name; 
    int defense;
    int attack;
    int energy;
    boolean isAlive;

    Pokemon(String name, int defense, int attack, int energy, boolean isAlive) {
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.energy = energy;
        this.isAlive = isAlive;
    }

    boolean isAlive() {
        return defense > 0;
    }

    void takeDamage(int damage) {
    defense = defense - damage;

    if (defense < 0) {
        defense = 0;
    }
}

    boolean useEnergy() {

        if (energy >= 2) {
            energy = energy - 2;
            return true;
        }

        return false;
    }

}
