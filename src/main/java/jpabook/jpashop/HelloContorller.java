package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloContorller {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data","hello!!");
        return "hello";

    }
}
@Controller
public class IndexController{
    @GetMapping("jpashop")
    public String {
            model.addAttribute();
            return ;
    }
}
