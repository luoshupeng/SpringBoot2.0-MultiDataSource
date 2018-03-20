package com.luoshupeng.multidatasource.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luoshupeng on 2018-03-20 8:57
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "redirect:/user/list";
    }
}
