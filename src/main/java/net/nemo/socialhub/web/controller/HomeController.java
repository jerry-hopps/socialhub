package net.nemo.socialhub.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tonyshi on 2016/12/22.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
