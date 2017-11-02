package com.spring.web;

import com.spring.entity.DemoDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HelloControllre {


    @RequestMapping("/hello")
    @ResponseBody
    public DemoDto hello(@RequestBody @Valid DemoDto dto) throws Exception{
        return dto;
    }

}
