package app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController extends BaseController {

    @GetMapping("/login")
    String info(Model model) {
        System.out.println("DemoController.info");
        return "login";
    }

    @GetMapping("/test")
    String test() {
        System.out.println("DemoController.test");
        return "main";
    }
}
