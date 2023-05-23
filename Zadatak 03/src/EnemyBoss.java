public class EnemyBoss extends BaseHero {

    public EnemyBoss(double health, double mana) {
        super(health, mana);
        dead = false;
        System.out.println("Enemy is created:");
        showStats();
    }

    @Override
    public void primaryFire() {
        health += 5;
        mana -= 15;
        System.out.println("Boss Dragon fires primary weapon!");
    }

    @Override
    public void secondaryFire() {
        mana -= 20;
    }

    @Override
    public void receiveHit() {
        health -= 20;
        mana += 5;
        System.out.println("Boss Dragon takes damage!");
        if (health <= 0) {
            dead = true;
            System.out.println("Boss Dragon is dead!");
        }
    }

        @Override
        public void showStats () {
            System.out.println("Boss Dragon stats> Health: " + health + " Mana: " + mana + " Dead?: " + dead);

        }
    }
