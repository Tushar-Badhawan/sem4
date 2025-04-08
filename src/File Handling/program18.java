import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Program18 
{
static int isPalindrome(String word) {
String revword = "";
for (int i = word.length() - 1; i >= 0; i--) 
{
revword += word.charAt(i);
}

if (revword.equalsIgnoreCase(word)) 
{
return 1;
}
else {
return 0;
}
}

public static void main(String args[]) throws FileNotFoundException {
File file = new File("D:\\sem4-programs-java\\src\\File Handling\\myfile.txt");
Scanner sc = new Scanner(file);
int count = 0;
while (sc.hasNextLine()) {
String str = sc.nextLine();
String words[] = str.split("\\s+");
for (int i = 0; i < words.length; i++) {
if (isPalindrome(words[i]) == 1) {
count++;
}
}
}
System.out.println("Total number of palindromes are: " + count);
sc.close();
}
}
