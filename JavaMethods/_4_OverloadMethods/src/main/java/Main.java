public class Main {
    public static void main(String[] args) {

        sum(1, 2);
        sum(1, 2.0f);
        sum(2.0, 5);
        sum(2.0, 3.0);

    }

    public static void sum(int x, int y) {
        System.out.println("You enter two int numbers");
    }

    public static void sum(int x, float y) {
        System.out.println("You enter one number integer and one number float");
    }

    public static void sum(double x, int y) {
        System.out.println("You enter one number double and one number integer");
    }

    public static void sum(double x, double y) {
        System.out.println("You enter two double numbers");
    }

}
