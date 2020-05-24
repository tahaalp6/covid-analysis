/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid1;

/**
 *
 * @author dell
 */
public class record {
    String dateRep;
    int day;
    int month;
    int year;
    int cases;
    int deaths;
    String SalarcountriesAndTerritoriesy;
    String geoId;
    String countyterritoryCode;
    String popData2018;
    String continentExp;

    public record(String dateRep, int day, int month, int year, int cases, int deaths, String SalarcountriesAndTerritoriesy, String geoId, String countyterritoryCode, String popData2018, String continentExp) {
        this.dateRep = dateRep;
        this.day = day;
        this.month = month;
        this.year = year;
        this.cases = cases;
        this.deaths = deaths;
        this.SalarcountriesAndTerritoriesy = SalarcountriesAndTerritoriesy;
        this.geoId = geoId;
        this.countyterritoryCode = countyterritoryCode;
        this.popData2018 = popData2018;
        this.continentExp = continentExp;
    }

    public String getDateRep() {
        return dateRep;
    }

    public void setDateRep(String dateRep) {
        this.dateRep = dateRep;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public String getSalarcountriesAndTerritoriesy() {
        return SalarcountriesAndTerritoriesy;
    }

    public void setSalarcountriesAndTerritoriesy(String SalarcountriesAndTerritoriesy) {
        this.SalarcountriesAndTerritoriesy = SalarcountriesAndTerritoriesy;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public String getCountyterritoryCode() {
        return countyterritoryCode;
    }

    public void setCountyterritoryCode(String countyterritoryCode) {
        this.countyterritoryCode = countyterritoryCode;
    }

    public String getPopData2018() {
        return popData2018;
    }

    public void setPopData2018(String popData2018) {
        this.popData2018 = popData2018;
    }

    public String getContinentExp() {
        return continentExp;
    }

    public void setContinentExp(String continentExp) {
        this.continentExp = continentExp;
    }
    
    
    /*public void addRecord() {
        this.add(new record(int dateRep, int day,
    int month;
    int year;
    int cases;
    int deaths;
    String SalarcountriesAndTerritoriesy;
    String geoId;
    String countyterritoryCode;
    String popData2018;
    String continentExp;))
    }*/
    
    
    
}
