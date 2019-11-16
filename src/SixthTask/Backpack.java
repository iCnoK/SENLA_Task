package SixthTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backpack {
    private int capacity;
    private int filledOut;
    private int costOfThings;
    private List<Thing> things;

    public int GetCapacity() {
        return capacity;
    }

    public void AddThing(Thing thing){
        things.add(thing);
    }

    public String GetThingsInString(){
        return Arrays.toString(things.toArray());
    }

    public Thing GetThing(int index){
        if (things.size() > 0){
            return things.get(index);
        }
        return null;
    }

    public Backpack(int capacity) {
        this.capacity = capacity;
        things = new ArrayList<Thing>();
        this.filledOut = 0;
    }

    public void FillBackpack(List<Thing> things){
        int tempCapacity = filledOut;
        int thingsIterator = 0;
        while(tempCapacity < capacity && thingsIterator < things.size()){
            /*while(tempCapacity + things.get(thingsIterator).GetWeight() > capacity){
                thingsIterator++;
            }*/
            if ((tempCapacity + things.get(thingsIterator).GetWeight()) <= capacity){
                tempCapacity += things.get(thingsIterator).GetWeight();
                AddThing(things.get(thingsIterator));
                costOfThings += things.get(thingsIterator).GetCost();
            }
            else{

                thingsIterator++;
            }
        }
        filledOut = tempCapacity;
    }

    public int GetFilledOut() {
        return filledOut;
    }

    public int GetCostOfThings() {
        return costOfThings;
    }
}
