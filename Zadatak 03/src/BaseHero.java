public abstract class BaseHero {
    double health;
    double mana;
    boolean dead;

    public BaseHero(double health, double mana) {
        this.health = health;
        this.mana = mana;
    }

    public abstract void primaryFire();
    public abstract void secondaryFire();
    public abstract void receiveHit();
    public abstract void showStats();
    public void AreaOfEffectDamage() {
        receiveHit();
    }
}