import java.util.*;
class WordExample {
    private String strdata;
    boolean valid = false;

    WordExample(String strdata) {
        this.strdata = strdata;
        int l = strdata.length();

        if (l > 0) {
            char terminator = strdata.charAt(l - 1);
            if ((terminator == '.' || terminator == '!' || terminator == '?') && strdata.equals(strdata.toUpperCase())) {
                this.valid = true;
            }
        }

        if (!valid) {
            System.out.println("String is NOT valid.");
        } else {
            strdata = strdata.substring(0, l - 1);
            System.out.println(strdata);
        }
    }

    void countWord() {
        if (!valid) 
        { 
          return;  
        }
        String words[] = strdata.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.length() > 0) {
                char f1 = Character.toLowerCase(word.charAt(0));
                char f2 = Character.toLowerCase(word.charAt(word.length() - 1));

                if ((f1 == 'a' || f1 == 'e' || f1 == 'i' || f1 == 'o' || f1 == 'u') &&(f2 == 'a' || f2 == 'e' || f2 == 'i' || f2 == 'o' || f2 == 'u')) 
                {
                    count++;
                }
            }
        }
        System.out.println("Total words starting and ending with a vowel: " + count);
    }
    void placeWord()
    {
          if(!valid)
          {
          return;
          }
          String words[]=strdata.split(" ");
          int x=0;
          for (int i=0;i<words.length;i++) 
          {
               if (words[i].length() > 0) {
                   char f1 = Character.toLowerCase(words[i].charAt(0));
                   char f2 = Character.toLowerCase(words[i].charAt(words[i].length() - 1));
   
                   if ((f1 == 'a' || f1 == 'e' || f1 == 'i' || f1 == 'o' || f1 == 'u') &&(f2 == 'a' || f2 == 'e' || f2 == 'i' || f2 == 'o' || f2 == 'u')) 
                   {
                     String temp=words[i];
                      words[i]=words[x];
                      words[x]=temp;
                      x++;
                   }
               }
           }
           for(String word:words)
           {
               System.out.print(word+" ");
           }

    }
}

public class Program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();

        WordExample we = new WordExample(s);
        if (we.valid) 
        {
            we.countWord();
            we.placeWord();
        }

    }
}
