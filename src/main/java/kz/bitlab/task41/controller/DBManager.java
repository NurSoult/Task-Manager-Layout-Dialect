package kz.bitlab.task41.controller;

import kz.bitlab.task41.db.Task;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static Long id = 6L;

    static {
        tasks.add(new Task(1L, "Complete Task 7 from Spring Boot till the end of lesson", "2020-10-23", true, "To create a Java EE application, you'll need to follow a few basic steps. First, you'll need to choose a Java IDE (Integrated Development Environment) that supports Java EE development, such as Eclipse or IntelliJ IDEA. Once you've installed your IDE, you'll need to set up your development environment by configuring your Java EE server and any necessary plugins."));
        tasks.add(new Task(2L, "Clear home and buy foods", "2020-10-25", false, "Buying products from a market can be an enjoyable experience. Here are some basic steps you can follow to buy products from a market."));
        tasks.add(new Task(3L, "Complete all home tasks at the weekend", "2020-10-28", false, "This typically means that the student is responsible for completing all tasks and exercises assigned by their teacher or professor outside of regular class time. Homework assignments are meant to reinforce the lessons and concepts taught in class, and to help students practice and develop their skills."));
        tasks.add(new Task(4L, "Develop simple project in Spring Boot for the final", "2020-12-12", true, "Visit the gym: Before signing up, visit the gym in person to get a feel for the atmosphere and to ask any questions you may have. Many gyms offer free trial periods, so you can try out the facilities and classes before committing to a membership."));
        tasks.add(new Task(5L, "Learn Italian Language", "2021-05-01", true, "Build your vocabulary: Start learning commonly used Italian words and phrases related to your interests, such as food, travel, or hobbies. Use flashcards or language learning apps to help you memorize new words."));
    }


    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static void addTask(Task task) {
        task.setId(id);
        id++;
        tasks.add(task);
    }

    public static Task getTask(Long id) {
        for (Task t: tasks) {
            if (t.getId() == id)
                return t;

        }
        return null;
    }

    public static void deleteTask(Long id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }

    }
    public static void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                break;
            }
        }
    }


}
