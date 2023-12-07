package Oct.Oct07.SetDemo;
import Oct.Oct07.Student;

import java.util.Set;
import java.util.TreeSet;

public class TS001 {
    public static void main(String[] args) {

        Set<Student> studentset = new TreeSet();

        Student s1 = new Student("Rahul",28,1);
        Student s2 = new Student("Aman",28,1);
        Student s3 = new Student("Lucky",28,2);

        //Comparable --> id or name or age --> id and name ? Not possible
        //Comparator --> Create a class for attribute SortById,SortByAge or SortByName

        studentset.add(s1);
        studentset.add(s2);
        studentset.add(s3);

        //How I have to sort the s1 and s2?
        // sort them on the basis of Ref id - Diff. mechanism
        //id or name?? - Multiple diff mechanism

        System.out.println(studentset);
        System.out.println(studentset.size());
    }
}


