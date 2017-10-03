package week4;

import java.util.ArrayList;
import java.util.List;

public class NestedClasses {

    String name = "Name non static";
    static String NAME = "Name static";

    public NestedClasses() {
        System.out.println("NestedClasses");
    }

    public InnerClass getInnerClass(){
        return new InnerClass();
    }


    // STATIC NESTED CLASS
    public static class StaticNestedClass {

        public StaticNestedClass() {
            System.out.println("StaticNestedClass");
            System.out.println("I see only static field - " + NAME); // can't see non-static fields
        }

    }


    // INNER CLASS
    public class InnerClass {
        public InnerClass() {
            System.out.println("InnerClass");
            System.out.println("I see only all fields - " + NAME + ", " + name);
        }
    }


    // METHOD LOCAL INNER CLASS
    public void doSomething(){


        class MethodLocalInnerClass {
            public MethodLocalInnerClass() {
                System.out.println("MethodLocalInnerClass");
            }
        }

        MethodLocalInnerClass methodLocalInnerClass = new MethodLocalInnerClass();
        methodLocalInnerClass = null;
    }

    // ANONYMOUS INNER CLASS
    public void doSomethingElse(){

        NestedClasses nestedClasses = new NestedClasses() {
            public int newField = 10;
        };

        Comparable c = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        List list = new ArrayList() {
            int some = 10;
            {
                add(1);
                add(2);
                some = 11;
            }
        };
    }



    public static void main(String[] args) {
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        NestedClasses nestedClasses = new NestedClasses();
        InnerClass innerClass = nestedClasses.getInnerClass();
        innerClass = null; // inner class steel alive

        nestedClasses.doSomething();
    }

}
