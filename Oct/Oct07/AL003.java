package Oct.Oct07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AL003 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList();
        Student s1 = new Student("Lucky",45,1);
        students.add(s1);
        //Student 2
        students.add(new Student("Rahul",28,2));

        System.out.println(students.size());

        // by using for each loop
//        for(Student s:students){
//            System.out.println(s.getName());
//        }

        System.out.println("-----------------");
        //By using the Iterator

//        Iterator i = students.iterator();
//        while(i.hasNext()){
//            Student temp =  (Student)i.next();
//            System.out.println(temp.getName());
//            System.out.println(temp.getAge());
        //}
//
            //By using the ListIterator

            ListIterator li = students.listIterator();
            while(li.hasNext()){
                Student temp =  (Student)li.next();
            System.out.println(temp.getName());
            System.out.println(temp.getAge());
            System.out.println(temp.getId());
            }

    }
}



