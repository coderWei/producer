package com.tiantong.producer.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/up-down-file")
public class FilesController {

    @PostMapping(value = "/upload")
    public @ResponseBody String upload(@RequestBody MultipartFile multipartFile) {

        return null;
    }


}
