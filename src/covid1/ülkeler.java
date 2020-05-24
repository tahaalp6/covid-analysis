
package covid1;

public class ülkeler {
    String ülkeler;
    int totalc;
    int newc;
    int totald;
    int newd;
    int population;
    double mortality;
    double attack;

    public ülkeler(String ülkeler, int totalc, int newc, int totald, int newd, int population, double mortality, double attack) {
        this.ülkeler = ülkeler;
        this.totalc = totalc;
        this.newc = newc;
        this.totald = totald;
        this.newd = newd;
        this.population = population;
        this.mortality = mortality;
        this.attack = attack;
    }

    public String getÜlkeler() {
        return ülkeler;
    }

    public void setÜlkeler(String ülkeler) {
        this.ülkeler = ülkeler;
    }

    public int getTotalc() {
        return totalc;
    }

    public void setTotalc(int totalc) {
        this.totalc = totalc;
    }

    public int getNewc() {
        return newc;
    }

    public void setNewc(int newc) {
        this.newc = newc;
    }

    public int getTotald() {
        return totald;
    }

    public void setTotald(int totald) {
        this.totald = totald;
    }

    public int getNewd() {
        return newd;
    }

    public void setNewd(int newd) {
        this.newd = newd;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getMortality() {
        return mortality;
    }

    public void setMortality(double mortality) {
        this.mortality = mortality;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
 
}