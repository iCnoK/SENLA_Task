package SixthTask;

import java.util.*;

public class SixthTaskMain {
    public static void Start() {
        int backpackCapacity = GetNumberFromConsole("Enter backpack capacity: ");
        int numberOfThings = GetNumberFromConsole("Enter number of things: ");
        List<Thing> things = new ArrayList<Thing>();
        Backpack backpack = new Backpack(backpackCapacity);

        for (int i = 0; i < numberOfThings; i++) {
            Thing thing = GetThingFromConsole(i);
            things.add(thing);
        }
        Collections.sort(things,Thing.COMPARE_BY_COST);
        backpack.FillBackpack(things);
        System.out.print("Backpack capacity = " + backpack.GetCapacity() + "\n");
        System.out.print("Backpack filled out = " + backpack.GetFilledOut() + "\n");
        System.out.print("Backpack cost of things = " + backpack.GetCostOfThings() + "\n");
        System.out.print("All things in backpack:\n");
        System.out.print(backpack.GetThingsInString());
    }

    private static Thing GetThingFromConsole(int index){
        System.out.print("Enter thing #" + index + "\n");
        int weight = GetNumberFromConsole("Enter weight of thing #" + index + " ", 0);
        int cost = GetNumberFromConsole("Enter cost of thing #" + index + " ", 0);
        return new Thing(weight, cost);
    }

    private static int GetNumberFromConsole(String message){
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()){
            System.out.print("Incorrect input!\n");
            GetNumberFromConsole(message);
        }
        return input.nextInt();
    }

    private static int GetNumberFromConsole(String message, int min){
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()){
            System.out.print("Incorrect input!\n");
            GetNumberFromConsole(message);
        }
        int number = input.nextInt();
        if (number <= min){
            System.out.print("Incorrect input!\n");
            GetNumberFromConsole(message);
        }
        return number;
    }
}
