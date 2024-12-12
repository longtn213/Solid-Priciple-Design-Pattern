package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        NameRepository repo = new NameRepository();
//        for (Iterator it = repo.getIterator();it.hasNext();) {
//            String name = (String) it.next();
//            System.out.println(name);
//        }
        // How it works in Java
        List<String> names = Arrays.asList("Eve","daniel","Ana");
        Stack<String> stack = new Stack<>();
        stack.push("10");
        stack.push("20");
        stack.push("30");

        Iterator<String> it = stack.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}