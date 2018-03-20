package com.luoshupeng.multidatasource.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luoshupeng on 2018-03-20 10:30
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Use /user/list show Primary Data. \n" +
                "Use /message/list show Secondary Data.";
    }
}
