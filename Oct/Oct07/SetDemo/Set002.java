package Oct.Oct07.SetDemo;

import Oct.Oct07.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set002 {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul",28,1);
        Student s4 = new Student("Rahul",28,1);

        //s1 == s4 but How set will know?
        //id s1 == id s4 - then it is duplicate set will remove

        Student s2 = new Student("Ravi",30,2);
        Student s3 = s1;

        List<Student> studentlist = new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        System.out.println(studentlist);
        System.out.println(studentlist.size());

        System.out.println("---------------------------");

        if(s1.equals(s3)){
            System.out.println("True");
            //s3 will not get printed or added to the set
        }

        Set<Student> studentSet = new HashSet();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        System.out.println(studentSet);
        System.out.println(studentSet.size());


    }
}
