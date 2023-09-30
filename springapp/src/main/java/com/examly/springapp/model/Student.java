public class Student {
    int stdentId;
    String firstName,lastName;
    void setStudentId(int stdentId){
        this.stdentId=stdentId;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    void setLastName(String lastName){
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
