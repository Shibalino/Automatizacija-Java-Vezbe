public class DwarfWarrior extends BaseHero {
    int rage;

    public DwarfWarrior(double health, double mana, int rage) {
        super(health, mana);
        this.rage = rage;
        dead = false;
        System.out.println("1st Hero is created:");
        showStats();
    }

    @Override
    public void primaryFire() {
        this.rage -=5;
        System.out.println("Dwarf Warrior Ornn fires primary weapon!");
    }

    @Override
    public void secondaryFire() {
        this.rage -=10;
        System.out.println("Dwarf Warrior Ornn fires secondary weapon!");
    }
    @Override
    public void receiveHit() {
        health -=10;
        System.out.println("Dwarf Warrior Ornn takes damage!");
        if (health <= 0){
            dead = true;
            System.out.println("Dwarf Warrior Ornn is dead!");
        }
    }
    public void showStats() {
        System.out.println("Dwarf Warrior Ornn stats> Health: "+health+" Rage: "+this.rage+" Dead?: "+dead);
    }

}