public class ElfMage extends BaseHero {

    public ElfMage(double health, double mana) {
        super(health, mana);
        dead = false;
        System.out.println("2nd Hero is created:");
        showStats();
    }

    @Override
    public void primaryFire() {
        mana -= 15;
        System.out.println("Elf Mage Lux fires primary weapon!");
    }

    @Override
    public void secondaryFire() {
        mana -= 50;
        System.out.println("Elf Mage Lux fires secondary weapon!");

    }

    @Override
    public void receiveHit() {
        health -= 30;
        System.out.println("Elf Mage Lux takes damage!");
        if (health <= 0) {
            dead = true;
            System.out.println("Elf Mage Lux is dead!");
        }
    }
        @Override
        public void showStats () {
            System.out.println("Elf Mage Lux stats> Health: " + health + " Mana: " + mana + " Dead?: " + dead);
        }
    }
