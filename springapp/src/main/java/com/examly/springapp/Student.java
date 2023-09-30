public class Student {
    int stdentId;
    String firstName,lastName;
    Student(int stdentId,String firstName,String lastName){
        this.stdentId=stdentId;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    int getStudentId(){
        return stdentId;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
}
