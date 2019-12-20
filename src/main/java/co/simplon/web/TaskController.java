package co.simplon.web;

import co.simplon.dao.TaskRepository;
import co.simplon.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
   /* public TaskController(TaskRepository taskRepository) {
      this.taskRepository = taskRepository;
    }


    public String hello(){
      return "Thank you for your visit...You are welcomme !";
    }
    @RestResource*/
   @GetMapping("/tasks")
   public List<Task> tasks(){
       return taskRepository.findAll();
    }
    @PostMapping("/tasks")
    public Task save(@RequestBody Task t){
        return taskRepository.save(t);
    }

}
