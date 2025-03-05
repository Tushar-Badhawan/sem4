import java.util.*;

class ArrayDemo {
void arrayFunc(int arr[], int key) {
System.out.println("Pairs with sum " + key + ":");
for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
if(arr[i] + arr[j] == key) {
System.out.println("(" + arr[i] + ", " + arr[j] + ")");
}
} 
} 
}
void arrayFunc(int A[], int p, int B[], int q) {
int i = 0, j = 0;   
while (i < p && j < q) {
if (A[i] > B[j]) {  
int temp = A[i];
A[i] = B[j];
B[j] = temp;
int k = j;
while (k+1 < q && B[k] > B[k + 1]) {
int temp2 = B[k];
B[k] = B[k + 1];
B[k + 1] = temp2;
k++;
}
}
i++;
}
System.out.println("Sorted Arrays:");
System.out.println("A: " + Arrays.toString(A));
System.out.println("B: " + Arrays.toString(B));
}
}

class Program11 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements in array: ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.print("Enter target sum: ");
int key = sc.nextInt();
ArrayDemo ad = new ArrayDemo();
ad.arrayFunc(arr, key);
System.out.print("Enter size of array A: ");
int p = sc.nextInt();
System.out.print("Enter size of array B: ");
int q = sc.nextInt();
int A[] = new int[p];
int B[] = new int[q];
System.out.println("Enter elements of A:");
for (int i = 0; i < p; i++) {
A[i] = sc.nextInt();
}
System.out.println("Enter elements of B:");
for (int i = 0; i < q; i++) {
B[i] = sc.nextInt();
}
ad.arrayFunc(A, p, B, q);
sc.close();
}
}
