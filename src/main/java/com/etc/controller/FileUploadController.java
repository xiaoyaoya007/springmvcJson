package com.etc.controller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class FileUploadController {
    @RequestMapping("/upload.do")
    public String Upload(@RequestParam MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println( file.getOriginalFilename());
        String dir=request.getServletContext().getRealPath("/upload");

        file.transferTo(new File(dir+"/"+file.getOriginalFilename()));

        return "success";
    }
    @RequestMapping("/uploads.do")
    public String Upload(@RequestParam MultipartFile[] file, HttpServletRequest request) throws IOException {
        for(MultipartFile file1 : file){
            System.out.println( file1.getOriginalFilename());
            String dir=request.getServletContext().getRealPath("/upload");
            file1.transferTo(new File(dir+"/"+file1.getOriginalFilename()));

        }

        return "success";
    }

    @RequestMapping("/downloads.do")
    public String downloads(String filename,HttpServletResponse response) throws IOException {
        String str="D:\\IdeaProjects\\ncp\\reception\\images\\";
        response.setContentType("application/octet-stream");//浏览器弹出来下载框
        response.addHeader("Content-Disposition","attachment;filename="+filename);//重命名文件
        IOUtils.copy(new FileInputStream(str+filename),response.getOutputStream());
        return null;
    }
}
