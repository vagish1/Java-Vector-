import src.Model.Student;
import src.Utils.Operation;

public class App{
    public static void main(String[] args) {
           
        Operation op = new Operation();
      
        while(true){

            System.out.println("1. Insert a student in a vector .");
            System.out.println("2. Show a student at Index .");
            System.out.println("3. Exit from program .");

            int choice = Integer.parseInt( System.console().readLine());

            switch(choice){
                case 1: 
                      int roll = Integer.parseInt( System.console().readLine());
                      String name = System.console().readLine();
                      String email = System.console().readLine();
                      String phone = System.console().readLine();
                      Student st  = new Student(name, email, phone, roll);
                      op.addStudent(st);  
                      break;
                case 2:
                     int index = Integer.parseInt(System.console().readLine());
                     op.printStudentAt(index);
                      break;
                case 3:
                      System.exit(0);
                      break;
            }

        }


    }
}