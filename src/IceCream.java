import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings() {
        System.out.println("\nFlavor: " + name);
        System.out.println("Scoops: " + numScoops);
        System.out.println("Cost: $" + cost);
        System.out.println("Topped with:");
        for (String each : toppings) {
            System.out.println("\t" + each);
        }
    }
}
