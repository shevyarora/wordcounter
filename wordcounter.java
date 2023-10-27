import java.util.Scanner;

public class wordcounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the words :");
        String word=sc.nextLine();

        int count=0;

        for(int i=0;i<word.length();i++)
        {

            if(word.charAt(i)==' '){
 
                count++;
            }
        }

        
         if((count==0) && (word.charAt(0)!=' ')){

            System.out.println("Words: 1");
        }
        
        else{
            System.out.println("Words: "+(count+1));
        }
        

    }
}
