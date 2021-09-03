import java.util.Scanner;

class Taxi {
    int fare;
    int d;

    public Taxi() {
        fare = 10;
    }

    public Taxi(int amt) {
        fare = amt;
    }

    void showFare() {
        System.out.println("Total Fare is: " + fare);
    }
}

public class Day3 {
    public static void main(String[] args) {
        int User_distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Distance from Taxi: ");
        User_distance = sc.nextInt();
        if (User_distance > 5) {
            Taxi ob = new Taxi(30 + 10 * (User_distance - 5));
            System.out.println("Enter the distance travelled: ");
            ob.d = sc.nextInt();
            ob.fare = ob.fare + 10 * ob.d;
            ob.showFare();
        }
        else{
            Taxi ob = new Taxi();
            System.out.println("Enter the distance travelled: ");
            ob.d = sc.nextInt();
            ob.fare = ob.fare + 10 * ob.d;
            ob.showFare();
        }

    }
}
