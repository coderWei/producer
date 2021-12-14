package com.tiantong.producer.controller;

import com.tiantong.producer.bean.FilesInfo;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/up-down-file")
public class FilesController {

    @Resource
    private FilesInfo filesInfo;

    public static final String FILE_SEPARATE = ".";

    public static final String FILE_PREFIX = "-";


    @PostMapping(value = "/upload")
    public @ResponseBody
    String upload(@RequestBody MultipartFile file) {
        if (ObjectUtils.isEmpty(file)) {
            return null;
        }
        String originalFilename = file.getOriginalFilename();
        assert originalFilename != null;
        String filePrefix = originalFilename.substring(originalFilename.lastIndexOf(FILE_SEPARATE));
        final String newFileName = UUID.randomUUID().toString().replace(FILE_PREFIX, "") + filePrefix;
        try {
            File newFile = new File(filesInfo.getPath(), newFileName);
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFileName;
    }
}
