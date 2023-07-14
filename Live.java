import java.util.Scanner;
public class Live {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number;

        number = console.nextInt();

        switch (number) {
            case 1:
                System.out.println("Number = ONE");
                break;
            case 2:
                System.out.println("Number = TWO");
                break;
            case 3:
                System.out.println("Number = THREE");
                break;
            case 4:
                System.out.println("Number = FOUR");
                break;
            case 5:
                System.out.println("Number = FIVE");
                break;
            case 6:
                System.out.println("Number = SIX");
                break;
            default:
                System.out.println("Cannot give you the name");
        }
    }
}
