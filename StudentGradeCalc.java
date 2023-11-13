import java.util.Scanner;

class StudentGradeCalc{
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println("Enter 5 subject marks: ");
        inputMarks(marks);
        int total = calcTot(marks);
        System.out.println("Total marks = "+total);
        float percentage = avgPerc(total);
        System.out.println("Average Percentage :"+percentage);
        gradeCal(percentage);
    }
    public static void inputMarks(int[] marks){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<marks.length;i++){
                marks[i] = sc.nextInt();
            }
        }
    }
    public static int calcTot(int[] marks){
        int ans = 0;
        for (int i = 0; i < marks.length; i++) {
            ans += marks[i];
        }
        return ans;
    }
    public static float avgPerc(int total){
        float ans = total / 5;
        return ans;
    }
    public static void gradeCal(float perc){
        if(perc>=90){
            System.out.println("--DISTINCTION--");
        }
        else if(perc>=80){
            System.out.println("--1st CLASS--");
        }
        else if(perc>=60){
            System.out.println("--2nd CLASS--");
        }
        else if(perc>=40){
            System.out.println("--3rd CLASS--");
        }
        else{
            System.out.println("--FAILED--");
        }
    }
}