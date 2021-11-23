package bsu.rfe.java.group10.lab1.Pekarskaya.varB8;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {


        Food[] breakfast = new Food[8];

        int cheeseAm = 0;
        int chewingGumAm = 0;
        int appleAm = 0;
        Apple apple = new Apple((String)null);
        ChewingGum chewingGum = new ChewingGum((String)null);
        Cheese cheese = new Cheese();
        int itemsSoFar = 0;



        for(String arg: args){
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("ChewingGum")) {
                breakfast[itemsSoFar] = new ChewingGum(parts[1]);
            }
            ++itemsSoFar;
        }

        for(int i = 0; i < 8 && breakfast[i] != null; ++i) {
            if (breakfast[i].equals(apple)) {
                ++appleAm;
            } else if (breakfast[i].equals(cheese)) {
                ++cheeseAm;
            } else if (breakfast[i].equals(chewingGum)) {
                ++chewingGumAm;
            } else break;
        }

        System.out.println("Amount of apples is " + appleAm + "\nAmount of cheese is " + cheeseAm + "\nAmount of gum is " + chewingGumAm);

        for(Food item: breakfast){
            if (item == null) {
                break;
            }
            else
            item.consume();
        }

        System.out.println("Good luck!");
    }


}
