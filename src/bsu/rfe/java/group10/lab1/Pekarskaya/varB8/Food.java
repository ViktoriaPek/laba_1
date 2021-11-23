package bsu.rfe.java.group10.lab1.Pekarskaya.varB8;
import java.util.Objects;

public abstract class Food implements Consumable, Nutritious {
    String name = null;

    public Food(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Food food = (Food)o;
            return Objects.equals(this.name, food.name);
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}