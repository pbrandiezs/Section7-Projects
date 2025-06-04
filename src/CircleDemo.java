public class CircleDemo {
    public static void main(String[] args) {
        Circle alpha = new Circle();
        Circle beta = new Circle(5);

        System.out.println("\nAlpha is: ");
        printCircleData(alpha);

        alpha.setRadius(5);
        System.out.println("\nAlpha is: ");
        printCircleData(alpha);

        System.out.println("\nBeta is: ");
        printCircleData(beta);
    }

    public static void printCircleData(Circle circle) {
        System.out.printf("Radius: %.2f%n", circle.getRadius());
        System.out.printf("Circumference: %.2f%n", circle.circumference());
        System.out.printf("Area: %.2f%n", circle.area());
    }
}
