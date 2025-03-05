import java.util.*;
class Program6 {
    public static void rearrange(int[] arr) {
        int n = arr.length, j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                int k = i;
                while (k > j) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rearrange(arr);

        System.out.println("After rearrangement:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
