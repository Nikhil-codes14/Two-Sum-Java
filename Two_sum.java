import java.util.*;

public class Two_sum {
    Scanner sc = new Scanner(System.in);

    void Twosum() {
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target value:");
        int Target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == Target) {
                    System.out.println(
                            " Pair found: " + arr[i] + " + " + arr[j] + "  = " + Target);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No correct value in given");

        }
    }

    public static void main(String[] args) {
        Two_sum obj = new Two_sum();
        obj.Twosum();
    }

}
