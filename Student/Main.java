import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> Students = new ArrayList<>();
        while (true) {
            System.out.println("[1]. add student.\n[2]. show students list\n[3]. remove student\n[4]. exit\n------------\nchoose 1 to 4: ");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    input.nextLine();
                    double sum = 0;
                    System.out.println("[A]. name : ");
                    //
                    String name = input.nextLine();
                    System.out.println("[B]. age : ");
                    //
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("[C]. grade(separated by space) : ");
                    String[] grade = input.nextLine().split(" ");
                    int c = Math.min(grade.length, 5);
                    for(int i = 0; i < c; i++){
                        sum += Double.parseDouble(grade[i]);
                    }
                    //
                    double average = sum / c;
                    Student s = new Student(name, age, average);
                    Students.add(s);
                break;
                case 2:
                    Student.Sowstudents(Students);
                break;
                case 3:
                    Student.Sowstudents(Students);
                    System.out.println("witch one you want to delet?");
                    int z = input.nextInt();
                    if(z <= Students.size() && z >= 1){
                        Students.remove(z - 1);
                        System.out.format("student no %d removed!\n", (z-1));
                    }else System.out.println("invalid number!");
                break;
                case 4:
                    input.close();
                    System.exit(0);               
            }
        }
    }

}