package com.example.todolist.controller;

import com.example.todolist.models.ListModel;
import com.example.todolist.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todolist")
@CrossOrigin(origins = "http://localhost:3000")
public class ListController {

    @Autowired
    private ListService listService;

    @GetMapping
    public List<ListModel> getAllList(){
        return listService.getAllLists();
    }

    @PostMapping
    public List<ListModel> createList(@RequestBody ListModel listModel){
        listService.createList(listModel);
        return listService.getAllLists();
    }

    @PutMapping("{id}")
    public List<ListModel> updateList(@PathVariable  Long id, @RequestBody ListModel listModel){
        listService.updateList(id, listModel);
        return listService.getAllLists();
    }

    @DeleteMapping("{id}")
    public List<ListModel> deleteList(@PathVariable Long id){
        listService.deleteList(id);
      return listService.getAllLists();
    }

}
