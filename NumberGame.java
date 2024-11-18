import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int chances=10;
        int finals=0;
        boolean PlayAgain=true;
        System.out.println("Welcome to the Number game!!!");
        System.out.println("You have   "+chances+"  chances to win the game");
        while (PlayAgain){
            int random=getrandomN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance  "+(i+1)+"   Guess a number between 1 and 100:");
                int user=sc.nextInt();
                if (user==random){
                    guess=true;
                    finals+=1;
                    System.out.println("Hurray!!! You have won the game");
                    break;
                }
                else if(user>random){
                    System.out.println("Your guess is too high");
                 }
                else{
                    System.out.println("Your guess is too low");
                }

            }
            if(guess==false){
                System.out.println("You have lost the game. The number is:"+random);
            }
            System.out.println("Do you want to play again:(yes/no)");
            String PA=sc.next();
            PlayAgain=PA.equalsIgnoreCase("yes");
        }
            System.out.println("Thank you for playing.Hope you enjoyed it");
            System.out.println("Here is your final score:"+finals);
            sc.close();
    }
    public static int getrandomN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
        }
}