/**
 * Write a description of class StudentDriver here.
 */
public class StudentDriver
{
    public static void main(String[] args) {
        int level = 10;
        String name = "Joe";
       
        Student joe = new Student(name, level);
        System.out.println(joe);
        //changeIt(level, name, joe);
        changeItAgain(level, name, joe);
        System.out.println("The variable level is now: " + level);
        System.out.println("The variable name is now: " + name);
        System.out.println(joe);
    }
   
    public static void changeIt(int value, String str, Student std) {
        value = 5;
        str = "Sally";  //String literal
       
        std.setName(str);
    }
   
    public static void changeItAgain(int value, String str, Student std) {
        value = 5;
       
        str = new String("Max");  //equivalent to a string literal
       
        std = new Student(str, value);
        System.out.println("The new student is now: " + std);
    }
}