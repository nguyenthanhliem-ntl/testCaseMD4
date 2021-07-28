package com.example.casedemo.contro;

import com.example.casedemo.model.Classer;
import com.example.casedemo.model.Teacher;
import com.example.casedemo.service.classsss.IClassService;
import com.example.casedemo.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class ClassContr {
    @Autowired
    private IClassService classService;

    @Autowired
    private ITeacherService teacherService;

    @ModelAttribute("Classes")
    public Iterable<Teacher> teachers(){
        return teacherService.findAll();
    }

    @GetMapping("/class1")
    public ModelAndView showListClass(){
        Iterable<Classer> classes = classService.findAll();
        ModelAndView modelAndView = new ModelAndView("/class/createClass");
        modelAndView.addObject("classes",classes);
        return modelAndView;
    }

    @GetMapping("/create-class")
    public ModelAndView showCreateClass(){
        ModelAndView modelAndView = new ModelAndView("/class/createClass");
        modelAndView.addObject("class",new Classer());
        return modelAndView;
    }

    @PostMapping("/create-class")
    public ModelAndView saveCreateClass(){
        ModelAndView modelAndView = new ModelAndView("/class/createClass");
        modelAndView.addObject("class",new Classer());
        modelAndView.addObject("message","Thêm thành công !");
        return modelAndView;
    }

    @GetMapping("/delete-class/{id}")
    public ModelAndView deleteClass(@PathVariable Long id){
        Optional<Classer> classers = classService.findById(id);
        if(classers.isPresent()){
            ModelAndView modelAndView = new ModelAndView("/class/deleteClass");
            modelAndView.addObject("class", classers.get());
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping("/delete-class")
    public String deleteClass(@ModelAttribute("class") Classer classer){
        classService.remove((classer.getId()));
        return "redirect:class";
    }

    @GetMapping("/edit-class/{id}")
    public ModelAndView showEditClass(@PathVariable Long id){
        Optional<Classer> classer = classService.findById(id);
        if(classer.isPresent()){
            ModelAndView modelAndView = new ModelAndView("/class/editClass");
            modelAndView.addObject("class", classer.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping("/edit-class")
    public ModelAndView updateClass(@ModelAttribute("class") Classer classer){
        classService.save(classer);
        ModelAndView modelAndView = new ModelAndView("/class/editClass");
        modelAndView.addObject("class",classer);
        modelAndView.addObject("message","Cập nhật thành công!");
        return modelAndView;
    }

    @PostMapping("/validateUser")
    public ModelAndView checkValidation(@Validated @ModelAttribute("class") Classer classer, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("/create-Class");
        }
        return new ModelAndView("/create-Class");
    }
}
