package com.spring.web;

import com.spring.entity.DemoDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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


    @RequestMapping
    public String proress(@RequestPart byte[] profile,@Valid DemoDto dto){
        return null;
    }

}
