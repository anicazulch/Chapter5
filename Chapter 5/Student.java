/**
 * Write a description of class Student here.
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int gradeLevel;
    private String name;
    /**
     * Constructor for objects of class Student
     */
    public Student(String tempName, int grade)
    {
        // initialise instance variables
        this.name = tempName;
        this.gradeLevel = grade;
    }
    public String getName() {
        return this.name;
    }
   
    public int getGradeLevel() {
        return this.gradeLevel;
    }
   
    public void setName(String str) {
        this.name = str;
    }
   
    public String toString() {
        return "The student, " + name + ", is in grade " + gradeLevel;
    }
}
