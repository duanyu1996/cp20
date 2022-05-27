package app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/demo")
    String s(Model model){
        model.addAttribute("msg","生效！");
        return "a";
    }
}
