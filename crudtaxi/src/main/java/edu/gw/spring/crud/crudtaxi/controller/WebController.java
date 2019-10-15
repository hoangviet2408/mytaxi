package edu.gw.spring.crud.crudtaxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/car")
    public String hello() {
        return "carForm.jsp";
    }
}
