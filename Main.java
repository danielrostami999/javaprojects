import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);     
        ArrayList<Students> students = new ArrayList<>();

        String response;
        do{
            System.out.println("please enter your name:");
            String name = scanner.nextLine();

            System.out.println("please enter your age:");
            int age = scanner.nextInt();

            System.out.println("please enter your grade(0 to 20):");
            int grade = scanner.nextInt();
            scanner.nextLine();

            String result = (grade >= 10)? "pass":"ignor";
            System.out.println(name + "your result is: "+ result);

            students.add(new Students(name, age, grade, result));

            System.out.println("Continue? (y/n):");
            response = scanner.nextLine();
            
        }while (response.equalsIgnoreCase("y"));
            scanner.close();
            double topGrade = 0;
            int acceptCount = 0;

            for (Students s : students){
                if(s.grade > topGrade){
                    topGrade = s.grade;
                }
                if(s.result == "pass"){
                acceptCount++;
                }
            }
            System.out.format("top grade is: %.2f\n",topGrade);
            System.out.format("number of acceptances: %d",acceptCount);
    }
}