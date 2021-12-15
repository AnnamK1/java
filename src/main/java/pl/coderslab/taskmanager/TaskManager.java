package pl.coderslab.taskmanager;

import pl.coderslab.ConsoleColors;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.tab;

public class TaskManager {
    static final String FILE_NAME = "tasks.csv";
    static final String[] OPTIONS = {"add", "remove", "list", "exit"};
    static String [] [] tasks;

    public static void printOptions(String[] tab) {
        System.out.println(ConsoleColors.BLUE);
        System.out.println("Please select an option: " + ConsoleColors.RESET);
        for (String option : tab) {
            System.out.println(option);
        }
    }

    public static void main (String[] args) {
        printOptions(OPTIONS);

    }
}
