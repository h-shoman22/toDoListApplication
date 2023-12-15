import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public ArrayList<String> tasks;
    public ToDoList(){
        tasks = new ArrayList<>();

    }
    
    public void setTasks(String addedTask){
        tasks.add(addedTask);
        System.out.println("Task Added");
    }

    public void allTasks(){
        System.out.println("These are the tasks in the list:");
        for(int i = 0; i < tasks.size(); i++){ // when you dont know if something is needed to be iterated.
            System.out.println(tasks.get(i)); //lists all the tasks
        }

    
    }
    
    public static void main(String[] args){
         ToDoList tdl = new ToDoList();
         Scanner scanner = new Scanner(System.in);
         int choice;
         do{
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.println("Enter task to add: ");
                String tasktoAdd = scanner.nextLine();
                tdl.setTasks(tasktoAdd);
            }
            if(choice == 2){
                tdl.allTasks();
            }
            if(choice == 3){
                scanner.close();
            }
         }while(choice != 3);
    }
}
