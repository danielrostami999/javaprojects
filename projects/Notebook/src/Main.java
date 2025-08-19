import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Notebook notebook = new Notebook();

        while (true) {
            System.out.println("------------------");
            System.out.println("1. Add new note: \n" + "2. Show notes: \n" + "3. Remove notes: \n" + "4. Exit:");
            System.out.print("choose 1 to 4 options:");
            int Input = input.nextInt();
           
            switch (Input) {
                case 1:
                    input.nextLine();
                    System.out.println("write your note:");
                    String note = input.nextLine();
                    notebook.addNote(note);
                    break;
                case 2:
                    notebook.showNotes();
                    break;
                case 3:
                    notebook.showNotes();
                    System.out.print("Enter note number to remove: ");
                    int index = input.nextInt();
                    notebook.RemoveNote(index);
                    notebook.showNotes();
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                    break;        
                default:
                    break;
            }
        }
    }
}
