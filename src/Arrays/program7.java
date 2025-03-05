import java.util.*;
class Program7 
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n, m;
System.out.println("Enter the size mXn of the array:");
m = sc.nextInt();
n = sc.nextInt();
int arr[][] = new int[m][n];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
arr[i][j] = sc.nextInt();
}
}
boolean found = false;
for (int i = 0; i < m; i++) 
{
int minVal = arr[i][0];
int minIndex = 0;
for(int j = 1; j < n; j++) 
{
if(arr[i][j] < minVal) 
{
minVal = arr[i][j];
minIndex = j;
}
}
boolean ismax = true;
for (int k = 0; k < m; k++) {
if (arr[k][minIndex] > minVal) {
ismax = false;
break;
}
}

if (ismax) 
{
System.out.println("Saddle point: " + minVal);
found = true;
}
}
if (!found) 
{
System.out.println("No element");
}
sc.close();
}
}
