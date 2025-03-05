import java.util.*;

class program5 {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) { // Even index: arr[i] < arr[i+1]
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else { // Odd index: arr[i] > arr[i+1]
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

        System.out.println("Zig-Zag Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}
