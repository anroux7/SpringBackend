package com.example.postgresql.service;

import com.example.postgresql.model.TodoItem;
import com.example.postgresql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    // call Repository
    @Autowired // injecting
    private TodoRepository todoRepo;

    public List<TodoItem> getAllTodoItems () {
        return todoRepo.findAll();
    }

    public TodoItem updateTodoItem(Long id, TodoItem requestedBody) {
        TodoItem updatingItem = getTodoItem(id);
        updatingItem.setDay(requestedBody.getDay());
        updatingItem.setReminder(requestedBody.getReminder());
        updatingItem.setText(requestedBody.getText());
        todoRepo.saveAndFlush(updatingItem);
        return updatingItem;
    }

    public TodoItem createTodoItem (TodoItem receivedBody) {
        TodoItem item = new TodoItem();
        item.setReminder(receivedBody.getReminder());
        item.setText(receivedBody.getText());
        item.setDay(receivedBody.getDay());
        todoRepo.save(item);
        return item;
    }

    public void deleteTodoItem (Long id) {
        todoRepo.deleteById(id);
    }

    public TodoItem getTodoItem(Long id) {
        List<TodoItem> todoitems = todoRepo.findAll();
        TodoItem found = new TodoItem();
       for (TodoItem todoItem : todoitems) {
           if (todoItem.getId() == id) {
                found = todoItem;
           }
       }
        return found;
    }
}
