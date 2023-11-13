import java.util.*;
class NumberGame{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(101);
        int guessNum;
        int score = 0;
        while(true){
            System.out.print("Enter your guess: ");
            guessNum = in.nextInt();
            score++;
            if(score > 10){
                System.out.println("No of guesses exceeded!! :(");
                break;
            }
            if(guessNum == randNum){
                System.out.println("Hurray! You win!!");
                System.out.println("Your score : "+score);
                break;
            }
            else if(guessNum > randNum){
                System.out.println("This number is high.Try again!!");
            }
            else{
                System.out.println("This number is low.Try again!!");
            }
        }
    }
}