package bsu.rfe.java.group10.lab1.Pekarskaya.varB8;

public class Apple extends Food {
    private String size;


    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " was eaten");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public double calculateCalories() {
        double calories;
        if (this.size.equals("Big")) {
            calories = 70.5D;
        } else {
            calories = 52.5D;
        }

        return calories;
    }

    public String toString() {
        String kkal = super.toString();
        return kkal + " Size '" + this.size.toUpperCase() + "',calories: " + this.calculateCalories() + " -";
    }
}

