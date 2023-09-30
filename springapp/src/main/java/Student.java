public class Student {
    int stdentId;
    String firstName,lastName;
    Student(int stdentId,String firstName,String lastName){
        this.stdentId=stdentId;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    void getData(){
        System.out.println("Student id:"+stdentId);
        System.out.println("First Name:"+firstName);
        System.out.println("Last Name:"+lastName);
    }
}
