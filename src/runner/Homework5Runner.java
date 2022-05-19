package src.runner;

import src.task1.Task1;
import src.task2.Task2;
import src.task4.Task4;
import src.task6.Task6;

public class Homework5Runner {
    public static void main(String[] args) {
        System.out.println("Task1:");
        Task1 task1 = new Task1();
        task1.getMeAnswer1();
        System.out.println("\n");

        System.out.println("Task2:");
        Task2 task2 = new Task2();
        task2.getMeAnswer2();
        System.out.println("\n");

        System.out.println("Task4:");
        Task4 task4 = new Task4();
        task4.getMeAnswer4();
        System.out.println("\n");

        Task6 task6 = new Task6();
        task6.getMeAnswer6();
    }
}
