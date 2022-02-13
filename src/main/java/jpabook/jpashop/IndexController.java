package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("jpashop")
    public String index(Model model) {
        model.addAttribute("data1", "jpashop");
        return "jpashop";
    }
}
