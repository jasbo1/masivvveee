package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Alex";
        name[1] = "Dan";
        name[2] = "Jim";
        switch (name[0]) {
            case "Alex":
                System.out.println("Good morning");
                break;
            case "Dan":
                System.out.println("Good afternoon");
                break;
            case "Jim":
                System.out.println("Good evening");
                break;
        }

        switch (name[1]) {
            case "Alex":
                System.out.println("Good morning");
                break;
            case "Dan":
                System.out.println("Good afternoon");
                break;
            case "Jim":
                System.out.println("Good evening");
                break;
        }
        switch (name[2]) {
            case "Alex":
                System.out.println("Good morning");
                break;
            case "Dan":
                System.out.println("Good afternoon");
                break;
            case "Jim":
                System.out.println("Good evening");
                break;
        }
    }


}

