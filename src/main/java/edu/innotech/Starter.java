package edu.innotech;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class Starter {
    public static void main(String[] args) {
        Student st = new Student("pete");
        st.addMark(3);
        System.out.println(st);
    }
}
