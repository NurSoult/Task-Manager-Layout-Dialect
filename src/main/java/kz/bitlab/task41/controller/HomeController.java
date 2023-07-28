package kz.bitlab.task41.controller;

import kz.bitlab.task41.db.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String indexPage(Model model) {
        ArrayList<Task> tasks = DBManager.getTasks();
        model.addAttribute("tasks", tasks);

        return "index";
    }

    @PostMapping(value = "/add-task")
    public String addTask(Task task) {
        DBManager.addTask(task);

        return "redirect:/";
    }

    @GetMapping(value = "/details/{taskId}")
    public String taskDetail(@PathVariable(name = "taskId") Long id, Model model) {
        Task selectedTask = null;
        ArrayList<Task> tasks = DBManager.getTasks();

        for (Task t: tasks) {
            if (t.getId() == id) {
                selectedTask = t;
                break;
            }
        }
        model.addAttribute("task", selectedTask);

        return "details";
    }


    @PostMapping(value = "/save-task")
    public String saveTask(@ModelAttribute Task task) {
        DBManager.updateTask(task);

        return "redirect:/";
    }

    @PostMapping(value = "/delete-task")
    public String deleteTask(@RequestParam(name = "delete_id") Long id) {
        DBManager.deleteTask(id);

        return "redirect:/";
    }


}
