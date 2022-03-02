package src.Utils;

import java.util.Vector;
import src.Model.Student;

public class Operation {
    
    private Vector<Student> stu;
    
    public Operation(){
        stu = new Vector<>();
    }

    public void addStudent(Student d){
        stu.add(d);

    }

    private Student getStudentAtIndex(int index){
       return stu.get(index);

    }

    public void printStudentAt(int index){

       
      Student obj =   getStudentAtIndex(index-1);

       
      System.out.println(obj.getName());
      System.out.println(obj.getRollNo());
      System.out.println(obj.getEmail());
      System.out.println(obj.getPhone());
      System.out.println("======================================");

    }


}
