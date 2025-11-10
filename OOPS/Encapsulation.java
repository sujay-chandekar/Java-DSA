public class Encapsulation {
    public static void main(String[] args) {
        Student stud = new Student();
        // stud.name = "jimmy";  //  Not allowed because 'name' is private
        stud.setter("jimmyy", 122);
        System.out.println("Name : " + stud.getName());
        System.out.println("Roll No : " + stud.getRollNo());
    }
}

class Student {
    private String name;
    private int roll_no;

    public void setter(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.roll_no;
    }
}
