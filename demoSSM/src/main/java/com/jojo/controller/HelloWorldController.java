package com.jojo.controller;

import com.jojo.pojo.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller("/hello")
public class HelloWorldController {

    @RequestMapping
    @ResponseBody
    public Response hello() {
        Response response = new Response(1, null);
        response.setData(new Date());
        return response;
    }
}
