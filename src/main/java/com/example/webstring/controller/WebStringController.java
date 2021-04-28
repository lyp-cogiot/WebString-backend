package com.example.webstring.controller;

import org.springframework.web.bind.annotation.*;
import com.example.webstring.entity.WebString;
@RestController
public class WebStringController {
    @ResponseBody
    @RequestMapping(value="/getWebString", method = RequestMethod.POST)
    public WebString getWebString(@RequestBody WebString webString){
        return webString;
    }
}

