package bsu.rfe.java.group10.lab1.Pekarskaya.varB8;

class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }

    public void consume() {
        System.out.println(this + " was eaten");
    }

    public String toString() {
        String kkal = super.toString();
        return kkal + " calories: " + this.calculateCalories() + " -";
    }

    public double calculateCalories() {
        return 363.0D;
    }
}
