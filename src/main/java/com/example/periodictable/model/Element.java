package com.example.periodictable.model;

public class Element {
    private String name;
    private String symbol;
    private int atomicNumber;
    private String atomicMass;
    private int atomicGroup;
    private int period;
    private String aggregationState;
    private String density;
    private String fusionPoint;
    private String boilingPoint;
    private String image;
    private String electronConfiguration;
    private double electronegativity;
    private int valency;
    private int atomicRadius;
    private String discoverer;
    private String discoveryYear;

    //             //
    // CONSTRUCTOR //
    //             //
    public Element(){

    }

    public Element(
            String name,
            String symbol,
            int atomicNumber,
            String atomicMass,
            int atomicGroup,
            int period,
            String aggregationState,
            String density,
            String fusionPoint,
            String boilingPoint,
            String image,
            String electronConfiguration,
            double electronegativity,
            int valency,
            int atomicRadius,
            String discoverer,
            String discoveryYear
    ) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.atomicGroup = atomicGroup;
        this.period = period;
        this.aggregationState = aggregationState;
        this.density = density;
        this.fusionPoint = fusionPoint;
        this.boilingPoint = boilingPoint;
        this.image = image;
        this.electronConfiguration = electronConfiguration;
        this.electronegativity = electronegativity;
        this.valency = valency;
        this.atomicRadius = atomicRadius;
        this.discoverer = discoverer;
        this.discoveryYear = discoveryYear;
    }

    //        //
    // GETTER //
    //        //
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getAtomicMass() {
        return atomicMass;
    }

    public int getAtomicGroup() {
        return atomicGroup;
    }

    public int getPeriod() {
        return period;
    }

    public String getAggregationState() {
        return aggregationState;
    }

    public String getDensity() {
        return density;
    }

    public String getFusionPoint() {
        return fusionPoint;
    }

    public String getBoilingPoint() {
        return boilingPoint;
    }

    public String getImage() {
        return image;
    }

    public String getElectronConfiguration() {
        return electronConfiguration;
    }

    public double getElectronegativity() {
        return electronegativity;
    }

    public int getValency() {
        return valency;
    }

    public int getAtomicRadius() {
        return atomicRadius;
    }

    public String getDiscoverer() {
        return discoverer;
    }

    public String getDiscoveryYear() {
        return discoveryYear;
    }

    //        //
    // SETTER //
    //        //
    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setAtomicMass(String atomicMass) {
        this.atomicMass = atomicMass;
    }

    public void setAtomicGroup(int atomicGroup) {
        this.atomicGroup = atomicGroup;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setAggregationState(String aggregationState) {
        this.aggregationState = aggregationState;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public void setFusionPoint(String fusionPoint) {
        this.fusionPoint = fusionPoint;
    }

    public void setBoilingPoint(String boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setElectronConfiguration(String electronConfiguration) {
        this.electronConfiguration = electronConfiguration;
    }

    public void setElectronegativity(double electronegativity) {
        this.electronegativity = electronegativity;
    }

    public void setValency(int valency) {
        this.valency = valency;
    }

    public void setAtomicRadius(int atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public void setDiscoverer(String discoverer) {
        this.discoverer = discoverer;
    }

    public void setDiscoveryYear(String discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    // To String


    @Override
    public String toString() {
        return "Elements{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicMass=" + atomicMass +
                ", atomicGroup=" + atomicGroup +
                ", period=" + period +
                ", aggregationState='" + aggregationState + '\'' +
                ", density='" + density + '\'' +
                ", fusionPoint='" + fusionPoint + '\'' +
                ", boilingPoint='" + boilingPoint + '\'' +
                ", image='" + image + '\'' +
                ", electronConfiguration='" + electronConfiguration + '\'' +
                ", electronegativity=" + electronegativity +
                ", valency=" + valency +
                ", atomicRadius=" + atomicRadius +
                ", discoverer='" + discoverer + '\'' +
                ", discoveryYear='" + discoveryYear + '\'' +
                '}';
    }

}
