package com.example.casedemo.contro;

import com.example.casedemo.model.Classer;
import com.example.casedemo.model.Point;
import com.example.casedemo.service.point.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

public class PointContro {
    @Autowired
    private PointService pointService;

    @ModelAttribute("Classes")
    public Iterable<Point> teachers(){
        return pointService.findAll();
    }

    @GetMapping("/point")
    public ModelAndView showListPoint(){
        Iterable<Point> points = pointService.findAll();
        ModelAndView modelAndView = new ModelAndView("/point/listPoint");
        modelAndView.addObject("points",points);
        return modelAndView;
    }

    @GetMapping("/create-point")
    public ModelAndView showCreatePoint(){
        ModelAndView modelAndView = new ModelAndView("/class/createPoint");
        modelAndView.addObject("class",new Point());
        return modelAndView;
    }

    @PostMapping("/create-point")
    public ModelAndView saveCreateClass(){
        ModelAndView modelAndView = new ModelAndView("/class/createPoint");
        modelAndView.addObject("point",new Point());
        modelAndView.addObject("message","Thêm thành công !");
        return modelAndView;
    }

    @GetMapping("/delete-point/{id}")
    public ModelAndView deletePoint(@PathVariable Long id){
        Optional<Point> point = pointService.findById(id);
        if(point.isPresent()){
            ModelAndView modelAndView = new ModelAndView("/class/deletePoint");
            modelAndView.addObject("point", point.get());
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping("/delete-point")
    public String deleteClass(@ModelAttribute("class") Point point){
        pointService.remove((point.getId()));
        return "redirect:point";
    }

    @GetMapping("/edit-point/{id}")
    public ModelAndView showEditPoint(@PathVariable Long id){
        Optional<Point> point = pointService.findById(id);
        if(point.isPresent()){
            ModelAndView modelAndView = new ModelAndView("/class/editPOint");
            modelAndView.addObject("point", point.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping("/edit-point")
    public ModelAndView updateClass(@ModelAttribute("point") Point point){
        pointService.save(point);
        ModelAndView modelAndView = new ModelAndView("/class/editPoint");
        modelAndView.addObject("point",point);
        modelAndView.addObject("message","Cập nhật thành công!");
        return modelAndView;
    }


}
