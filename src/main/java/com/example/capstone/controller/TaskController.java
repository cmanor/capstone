package com.example.capstone.controller;

import com.example.capstone.model.Task;
import com.example.capstone.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;
    // display list of tasks
    @GetMapping("/tasks")
    public String viewTaskPage(Model model) {
        model.addAttribute("listTasks", taskService.getAllTasks());
        return "tasks";
    }

    @GetMapping("/newTaskForm")
    public String newTaskForm(Model model) {
        //create model attribute to bind form data
        Task task = new Task();
        model.addAttribute("task", task);
        return "new_task";
    }

    @PostMapping("/saveTask")
    public String saveTask(@ModelAttribute("task") Task task){
        //save task to database
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model) {

        //get task from the service
        Task task = taskService.getTaskById(id);

        // set employee as a model attribute to pre-poulate the form
        model.addAttribute("task", task);
        return "update_task";

    }

}
