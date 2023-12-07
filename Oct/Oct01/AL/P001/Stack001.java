package Oct.Oct01.AL.P001;

import java.util.Stack;

public class Stack001 {
    public static void main(String[] args) {

        Stack books = new Stack();
        books.add("Java");
        books.push("Python");
        books.push("C++");
        books.remove(1);

        System.out.println(books.size());
        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books);

    }
}

