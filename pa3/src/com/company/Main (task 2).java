package com.company;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length < 1) {
            System.out.println("Error, usage: java ClassName inputfile");
            System.exit(1);
        }
        Scanner reader = new Scanner(new FileInputStream(args[0]));

        Set<String> student = new HashSet<>();
        while (reader.hasNext()){
            String lhs = reader.next();
            String rhs = reader.next();
            int chs = reader.nextInt();
            if(chs > 0) {
                student.add(lhs + " " + rhs + " " + chs);
            }
        }
        student.stream().sorted().forEach(e -> System.out.println(e));
    }
}