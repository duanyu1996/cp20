package app.exception;

/**
 * 管理员未登录异常
 */
public class AdminNoLoginException extends RuntimeException {
    @Override
    public String getMessage() {
        return "后台管理员未登录!";
    }
}
