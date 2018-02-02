
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args){
    int yesCnt = 0; int noCnt = 0;
    Scanner input = new Scanner(System.in);
    String letter = "";
    System.out.println("Vote by entering 'Y' for yes, 'N' for no, or 'Q' to quit voting");
do {
    System.out.println("Enter Vote: ");
    letter = input.next();
if (letter.equalsIgnoreCase("Y")) {
    yesCnt++;   
    System.out.println("You voted yes");
}
else if (letter.equalsIgnoreCase("N")) {
    noCnt++;
    System.out.println("You voted no");
}	 
else if (!letter.equalsIgnoreCase("Q")) {
    System.out.println("INVALID CODE: Vote by entering 'Y' for yes, 'N' for no, or 'Q' to quit voting");
continue;
}
}while (!letter.equalsIgnoreCase("Q"));
    System.out.println("Yes votes: " + yesCnt + "\nNo votes: " + noCnt);
}

}