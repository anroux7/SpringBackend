package com.example.postgresql.controller;

import com.example.postgresql.model.TodoItem;
import com.example.postgresql.repository.TodoRepository;
import com.example.postgresql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//http://localhost:8085
//CrossOrigin(origins = "http://localhost:3000") if it was the React App.

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081/")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true", methods = {RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    //controller call a service and send it away.
    @Autowired
    private TodoService todoService;

    // test Block
    // @GetMapping("/")
    // public List<TodoItem> getAllTodoItems() {
    //     return todoService.getAllTodoItems();
    // }

    // @GetMapping("/{id}")
    // public TodoItem getTodoItem(@PathVariable Long id) {
    //     // todoitem.steam().filter.(f -> id.equals(f.getId()))).findAny().orElse(null);
    //     return todoService.getTodoItem(id);
    // }

    //Test END

    /// front-end      java-server
    //HttpRequest ---> Controller ----> Service ---> Repositories
    //front-end  <---- Controller <---- Service  <---- 

    /**
    *CRUD
    *---
    * Create = Post = 'http://localhost:8085/api/domainObjectName'
    * Read = GET = 'http://localhost:8085/api/domainObjectName' Or singual /{id}
    * Update = PUT = 'http://localhost:8085/api/domainObjectName/{id}' 
    * Delete = DELETE = 'http://localhost:8085/api/domainObjectName/{id}'
    */

    @GetMapping("/todos")
    public List<TodoItem> fetchTodoItems() {
        return todoRepository.findAll();
    }

    //   fetch todo item (from Database)
    @GetMapping("/todoItem/{id}")
    public ResponseEntity<?> getTodoItem (@PathVariable Long id) {
        TodoItem todoItem = todoService.getTodoItem(id);

     // long way
     //return ResponseEntity.status(HttpStatus.OK).body(todoItems);
     
    //shortcut
    return ResponseEntity.ok(todoItem);
    }

    @PostMapping("/todoCreate")
    public ResponseEntity<?> createNewTodoItem (@RequestBody TodoItem receivedBody) {
        TodoItem saveTodoItem = todoService.createTodoItem(receivedBody);

        return ResponseEntity.ok(saveTodoItem);
    }

     @DeleteMapping("/todoItemDelete/{id}")
    public ResponseEntity<?> deleteTodoItems (@PathVariable Long id) {
        todoService.deleteTodoItem(id);
        return ResponseEntity.ok(null);
    }

    // not needed to pass in id already have it in the body
    @PutMapping("/todoItemUpdate/{id}")
    public ResponseEntity<?> updateAllTodoItems (@PathVariable Long id, @RequestBody TodoItem receivedBody) {
        // call the service
        // get the data back from the server
        TodoItem updateTodoItem = todoService.updateTodoItem(id,receivedBody);
        // send it! (back to front-end)
        return ResponseEntity.ok(updateTodoItem);
    }

}
