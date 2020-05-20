
package covid1;

public class ülkeler {
    String ülkeler;
    String totalc;
    String newc;
    String totald;
    String newd;
    String population;
    String mortality;
    String attack;

    public ülkeler(String ülkeler, String totalc, String newc, String totald, String newd, String population, String mortality, String attack) {
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

    public String getTotalc() {
        return totalc;
    }

    public void setTotalc(String totalc) {
        this.totalc = totalc;
    }

    public String getNewc() {
        return newc;
    }

    public void setNewc(String newc) {
        this.newc = newc;
    }

    public String getTotald() {
        return totald;
    }

    public void setTotald(String totald) {
        this.totald = totald;
    }

    public String getNewd() {
        return newd;
    }

    public void setNewd(String newd) {
        this.newd = newd;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getMortality() {
        return mortality;
    }

    public void setMortality(String mortality) {
        this.mortality = mortality;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }


    
}
