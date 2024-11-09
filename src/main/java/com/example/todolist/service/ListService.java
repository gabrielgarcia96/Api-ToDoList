package com.example.todolist.service;

import com.example.todolist.models.ListModel;
import com.example.todolist.repository.ListRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ListService {

    @Autowired
    private ListRepository listRepository;

    public List<ListModel> getAllLists() {
        return listRepository.findAll();
    }

    public ListModel createList(ListModel listModel) {
       return listRepository.save(listModel);

    }

    public ListModel updateList(Long id, ListModel listModel) {
        if(listRepository.findById(id).isPresent()) {
            listModel.setId(id);
            return  listRepository.save(listModel);
        }else {
            throw new EntityNotFoundException("List not found with id: " + id);
        }
    }

    public void deleteList(Long id) {
         listRepository.deleteById(id);
    }
}
