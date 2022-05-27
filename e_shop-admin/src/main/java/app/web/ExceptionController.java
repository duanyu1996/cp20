package app.web;

import app.exception.AdminNoLoginException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.logging.Logger;

/**
 *
 */
@ControllerAdvice
public class ExceptionController {
    private static final Logger logger = Logger.getLogger(ExceptionController.class.getSimpleName());

    @ExceptionHandler(AdminNoLoginException.class)
    String exception(Model model) {
        logger.info("进入了异常处理...");
        model.addAttribute("msg", "您还没有登录!");
        return "login";
    }
}
