import java.util.Scanner;
class QuizAppvthTimer{
    public static void main(String[] args) {
        String[] questions = new String[10];
        questions[0] = "1.Who is the father of Computers?";
        questions[1] = "2.Which of the following is the correct abbreviation of COMPUTER?";
        questions[2] = "3.Which of the following is the correct definition of Computer?";
        questions[3] = "4.What is the full form of CPU?";
        questions[4] = "5.Which of the following language does the computer understand?";
        questions[5] = "6.Which of the following computer language is written in binary codes only?";
        questions[6] = "7.Which of the following is the brain of the computer?";
        questions[7] = "8.Which of the following is not a characteristic of a computer?";
        questions[8] = "9.Which of the following is the smallest unit of data in a computer?";
        questions[9] = "10.Which of the following unit is responsible for converting the data received from the user into a computer understandable format?";
        String[] options  = new String[10];
        options[0] = "a) James Gosling \nb) Charles Babbage\nc) Dennis Ritchie\nd) Bjarne Stroustrup";
        options[1] = "a) Commonly Occupied Machines Used in Technical and Educational Research \nb) Commonly Operated Machines Used in Technical and Environmental Research \nc) Commonly Oriented Machines Used in Technical and Educational Research  \nd) Commonly Operated Machines Used in Technical and Educational Research";
        options[2] = "a) Computer is a machine or device that can be programmed to perform arithmetical or logic operation sequences automatically\nb) Computer understands only binary language which is written in the form of 0s & 1s \nc) Computer is a programmable electronic device that stores, retrieves, and processes the data \nd) All of the mentioned";
        options[3] = "a) Computer Processing Unit\nb) Computer Principle Unit \nc) Central Processing Unit \nd) Control Processing Unit";
        options[4] = "a) Computer understands only C Language\nb) Computer understands only Assembly Language\nc) Computer understands only Binary Language\nd) Computer understands only BASIC";
        options[5] = "a) pascal\nb) machine language\nc) C\nd) C#";
        options[6] = "a) Central Processing Unit\nb) Memory\nc) Arithmetic and Logic unit\nd) Control unit";
        options[7] = "a) Versatility\nb) Accuracy\nc) Diligence\nd) I.Q.";
        options[8] = "a) Bit\nb) KB\nc) Nibble\nd) Byte";
        options[9] = "a) Output Unit\nb) Input Unit\nc) Memory Unit\nd) Arithmetic & Logic Unit";
        char answers[] = {'b','d','d','c','c','b','a','d','a','b'};
        char[] ans = new char[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            long start = System.currentTimeMillis();
            long end  = start + 300;
            System.out.println(questions[i]);
            System.out.println(options[i]);
            while (System.currentTimeMillis() < end){
                  System.out.print("Enter your option: ");
                 ans[i] = in.next().charAt(0);
            }
        }
        int score=0;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == answers[i]){
                score++;
            }
        }
        System.out.println("Your score : "+score);
    }
}