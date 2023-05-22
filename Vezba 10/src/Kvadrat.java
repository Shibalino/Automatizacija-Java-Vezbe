public class Kvadrat extends Shape {
    double stranica_A;

    public Kvadrat(String boja, String naziv, double stranica_A) {
        super(boja, naziv);
        this.stranica_A = stranica_A;
    }

    public void Kvadrat_povrsina() {
        System.out.println("Ovaj kvadrat je "+this.boja+" boje i zove se "+this.naziv+". "+"Duzina stranice je: "+this.stranica_A+" cm.");
        System.out.println("Povrsina ovog kvadrata je: " + (this.stranica_A * this.stranica_A)+" cm2.");
    }
}
