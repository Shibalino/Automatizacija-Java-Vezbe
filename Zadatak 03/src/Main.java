// Zadatak 03 - RPG igra
//        1. Neophodno je kreirati apstraktnu klasu "BaseHero" i u njoj polja koja sadrže podatke:
//        - o zdravlju,
//        - o količini mane,
//        - i o tome da li je heroj živ ili mrtav.
//        2. Apstraktna klasa "BaseHero" treba da sadrži i apstraktne metode koje pokazuju šta se događa kada:
//        - je heroj pogođen ("receiveHit"),
//        - heroj upotrebi primarno oružje ("primaryFire"),
//        - heroj upotrebi sekundarno oružje ("secondaryFire"),
//        - protivnik izvede napad koji svoju štetu pravi na određenoj površini ("areaOfEffect").
//        3. Trebalo bi napraviti i klase "DwarfWarrior" i "ElfMage" koje nasleđuju klasu "BaseHero" ali imaju i neka svoja specifična polja:
//        - Dwarf Warrior pri udarcu gubi 10 zdravlja, troši 5 rage-a korišćenjem primarnog oružja i 10 rage-a korišćenjem sekundarnog oružja,
//        - Elf Mage pri udarcu gubi 30 zdravlja, troši 15 mane korišćenjem primarnog oružja i 50 mane korišćenjem sekundarnog oružja.
//        4. Klase "DwarfWarrior" i "ElfMage" moraju imati parametrizovane konstruktore, koji bi omogućili korisniku da podesi osnovne startne parametre heroja.
//        5. Takođe, trebalo bi prepisati metodu "show" u svakoj od nasleđenih klasa kako bi se prikazalo trenutno stanje podataka o herojima.
//        6. Neophodno je i napraviti nasleđenu klasu negativnog heroja po izboru.
//        7. Simulirati borbu


public class Main {

   public static void main(String[] args) {
       System.out.println("Welcome to the RPG game fight. In this fight 2 Heroes go against 1 Enemy Boss in 3 rounds.");
       DwarfWarrior Ornn = new DwarfWarrior(50,30, 10);
       System.out.println();
       ElfMage Lux = new ElfMage(50,30);
       System.out.println();
       EnemyBoss Dragon = new EnemyBoss(100,50);
       System.out.println();

       System.out.println("1st round starts now! GLHF!");
       System.out.println();

       Ornn.primaryFire();
       Dragon.receiveHit();
       Lux.secondaryFire();
       Dragon.receiveHit();
       Dragon.primaryFire();
       Ornn.AreaOfEffectDamage();
       Lux.AreaOfEffectDamage();

       System.out.println("1st round ends! Take a look at the stats of all participants.");
       System.out.println();

       Ornn.showStats();
       Lux.showStats();
       Dragon.showStats();

       System.out.println();
       System.out.println("2nd round starts now! GLHF!");
       Ornn.secondaryFire();
       Dragon.receiveHit();
       Ornn.primaryFire();
       Dragon.receiveHit();
       Dragon.secondaryFire();
       Ornn.receiveHit();
       Lux.primaryFire();
       Dragon.AreaOfEffectDamage();

       System.out.println("2nd round ends! Take a look at the stats of all participants.");
       System.out.println();

       Ornn.showStats();
       Lux.showStats();
       Dragon.showStats();

       System.out.println();
       System.out.println("3rd round starts now! GLHF!");

       Lux.primaryFire();
       Dragon.receiveHit();

       System.out.println();
       System.out.println("3rd round ends now because the Dragon is dead! Lux dealt the final blow and slayed the Dragon!");
       System.out.println("GG!");

       }
   }