public class final_keyword {
    final static float pi = (float)3.14;
    public static void main(String[] args) {

        System.out.println(pi);
        //Give an error because we cannot reassign the final variable
        //pi = (float)3.144444;
        Student stud = new Student();
        stud.privateData();
        
    }
}

class College{
    final void privateData(){
        System.out.println("College private data....");
    }
}
class Student extends College{
    //this give an error 
    // void privateData(){
    //     System.out.println("Student data .....");
    // }
}