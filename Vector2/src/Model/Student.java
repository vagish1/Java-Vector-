package src.Model;

public class Student {
    
    private final String name;
    private final String email;
    private final String phone;
    private final int rollNo;

    public Student(String n, String e, String p, int r){

        name = n;
        email = e;
        phone = p;
        rollNo = r;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }

    public int getRollNo() {
        return rollNo;
    }

}
