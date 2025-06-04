public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream alpha = new IceCream("Vanilla", 5, 2);
        IceCream beta = new IceCream("Chocolate", 4, 1);

        alpha.addTopping("Sprinkles");
        alpha.printToppings();

        alpha.addTopping("Strawberries");
        alpha.printToppings();

        beta.printToppings();
    }
}
