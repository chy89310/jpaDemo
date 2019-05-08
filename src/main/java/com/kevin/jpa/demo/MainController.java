package com.kevin.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ChildRepository childRepo;
    @Autowired
    private ParentRepository parentRepo;

    @RequestMapping("/")
    public List<ParentModel> index() {
        return parentRepo.findAll();
    }

    @RequestMapping("/add")
    public String add() {
        for (int i = 0; i < 10; i++) {
            ParentModel parentModel = new ParentModel("parent" + i);
            parentRepo.save(parentModel);
            for (int j = 0; j < 10; j++) {
                ChildModel childModel = new ChildModel("child" + i + j);
                childModel.setParent(parentModel);
                childRepo.save(childModel);
            }
        }
        return "success";
    }

}
