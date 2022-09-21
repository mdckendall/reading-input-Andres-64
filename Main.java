import java.util.Scanner;
class Main {
    public static void main(String[] args) {  
        System.out.println("Enter a word:");
        Scanner myWord = new Scanner(System.in);
      
        String word = myWord.nextLine();
      
        int stringLength = word.length();
        System.out.println(stringLength);
    }
}
