package com.etc.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @RequestMapping("/upload.do")
    public String Upload(@RequestParam MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println( file.getOriginalFilename());
        String dir=request.getServletContext().getRealPath("/upload");

        file.transferTo(new File(dir+"/"+file.getOriginalFilename()));

        return "success";
    }
}
