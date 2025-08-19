public class Notebook {
    final int MAX = 10;
    String[] notes = new String[MAX];
    int count = 0;

    public void addNote(String note){
        if(count < MAX){
            notes[count] = note;
            count++;
            System.out.println("note added!");
        }else System.out.println("notebook Full!");
    }

    public void showNotes(){
        if(count > 0){
            for(int i = 0 ;i < count; i++){
                System.out.println("-------------");
                System.out.println("[" + (i + 1) +"] : " + notes[i]);
            }
        }else{
            System.out.println("note is empty!");
            return;
        }
    }
    public void RemoveNote(int index){
        if(count == 0){
            System.out.println("notes is alredy empty!!!");
            return;
        }
        if (index < 1 || index > count){
            System.out.println("Invalid note number!\nPlease choose between 1 and " + count);
            return;
        }
        for(int i = index -1; i < count; i++){
            notes [i] = notes[i+1];
        }
        notes[count] = null;
        count--;
        System.out.println("Note removed.");

    }
}