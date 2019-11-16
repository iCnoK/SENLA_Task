package SixthTask;

import java.util.Comparator;

public class Thing{
    private int weight;
    private int cost;

    public int GetWeight() {
        return weight;
    }

    public void SetWeight(int weight) {
        if (weight > 0){
            this.weight = weight;
        }
    }

    public int GetCost() {
        return cost;
    }

    public void SetCost(int cost) {
        if (cost > 0){
            this.cost = cost;
        }
    }

    public Thing(int weight, int cost) {
        this.SetWeight(weight);
        this.SetCost(cost);
    }

    @Override
    public String toString() {
        return "|Weight = " + weight + ", Cost = " + cost + "|";
    }

    public static Comparator<Thing> COMPARE_BY_COST = new Comparator<Thing>() {
        public int compare(Thing one, Thing second) {
            return second.cost - one.cost;
            //return one.cost.compareTo(other.cost);
        }
    };
}
