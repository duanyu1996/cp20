package app.web;

import app.exception.AdminNoLoginException;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

public abstract class BaseController {
    private static final Logger logger = Logger.getLogger(BaseController.class.getSimpleName());

    @ModelAttribute
    void check(HttpServletRequest request) {
        logger.info("进行登录检查");
        if (request.getSession().getAttribute("admin") == null && !request.getRequestURI().equals("/login"))
            throw new AdminNoLoginException();
    }
}
