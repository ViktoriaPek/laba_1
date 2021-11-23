package bsu.rfe.java.group10.lab1.Pekarskaya.varB8;

public class ChewingGum extends Food {
    private String flavour;

    public ChewingGum(String flavour) {
        super("Gum");
        this.flavour = flavour;
    }

    public void consume() {
        System.out.println(this + " was eaten");
    }

    public String getFlavour() {
        return this.flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String toString() {
        String kkal = super.toString();
        return kkal + " with taste '" + this.flavour.toUpperCase() + "', calories: " + this.calculateCalories() + " -";
    }

    public double calculateCalories() {
        double calories = 0.0D;
        if (this.flavour.equals("Mint")) {
            calories = 177.5D;
        } else if (this.flavour.equals("watermelon")) {
            calories = 170.2D;
        } else if (this.flavour.equals("cherry")) {
            calories = 150.2D;
        }

        return calories;
    }
}