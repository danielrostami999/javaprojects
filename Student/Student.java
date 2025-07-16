import java.util.ArrayList;

public class Student {
    String name;
    int age;
    double average;
    
    public Student(String name, int age, double average){
        this.name = name;
        this.age = age;
        this.average = average;
    }
    
    public void Show(){
        System.out.format("name : %s ,age : %d ,grade : %.2f\n", name, age, average);
        System.out.println("-------------------------------************************");
    }

    public static void Sowstudents(ArrayList<Student> Students){
        if(Students.isEmpty()){
            System.out.println("*------------------*");
            System.out.println("|Students is empty!|");
            System.out.println("*------------------*");
        }else{
            for (int i = 0; i < Students.size(); i++){
                System.out.println("-------------------------------************************");
                System.out.format("[" + (i+1) + "]. : ");
                Students.get(i).Show();
            }
            }
        }

}
