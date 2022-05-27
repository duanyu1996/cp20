package app.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

@WebFilter("*.html")
public class Post2Get implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(new MyRequest((HttpServletRequest) servletRequest), servletResponse);
    }

    /**
     * XXWrapper 包装类 装饰器模式
     */
    private static class MyRequest extends HttpServletRequestWrapper {

        public MyRequest(HttpServletRequest request) {
            super(request);
        }

        @Override
        public String getMethod() {
            return "GET";
        }
    }
}
