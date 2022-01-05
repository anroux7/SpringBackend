package com.example.postgresql.repository;

import com.example.postgresql.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;


// Testing Purposes without a DB
//Normally store it in the database here
//private List<TodoItem> todoItems  = new ArrayList<>();

//Because the example does not use an DB Need to keep count of the ID
//private Integer idCounter = 0;
//
//public List<TodoItem> fetchAllTodoItems () {
//        if (todoItems.size() == 0) {
//        TodoItem item1 = new TodoItem();
//        item1.setId(idCounter++);
//        item1.setFinished(false);
//        item1.setTask("Task #1");
//
//        todoItems.add(item1);
//        }
//        return todoItems;
//        }
//
//public TodoItem save(TodoItem todoItem) {
//        todoItem.setId(idCounter++);
//        todoItems.add(todoItem);
//        return todoItem;
//        }
//
//public void delete(Integer id) {
//        todoItems = todoItems.stream().filter(todItem -> todItem.getId().equals(id))
//        .collect(Collectors.toList());
//
//        }

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
