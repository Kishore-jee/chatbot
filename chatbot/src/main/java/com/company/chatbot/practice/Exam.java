package com.company.chatbot.practice;

public class Exam {
    public static void main(String[] args) {
//        one();
//        one1();
        one2();
    }
    public static void one(){
        int x, y;
//        x = 1, y = 2; // C - error
        x = 1; y = 2;
        int z = ++x + y++;
        System.out.println(x + " - " + y + " - " + z); // 2 3 4
    }
    public static void one1(){
        int y = 4;
        var x = switch (y % 3) {
            case 0 -> 6;
//            case 1: {yield 7;} // C -error
            case 1 -> 7;
            case 2 -> 8;
            default -> 9;
//        } // C - error
        };
        System.out.println(x);
    }
    public static void one2() {
        System.out.println("d" + (1 + 2)); // d3
        System.out.println("d".indexOf("b")); // -1
        System.out.println("d".substring(0, 1)); // d
        System.out.println("abc".equals(null)); // false
        System.out.println(null instanceof String); // false
        System.out.println("d" + null);// dnull
    }

    class Example {
        private final void method() { }
    }
}
