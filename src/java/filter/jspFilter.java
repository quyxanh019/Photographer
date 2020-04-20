package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class jspFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse resp = (HttpServletResponse) response;

            //get the URI of the current site
            String URL = req.getRequestURI();
            String path = req.getContextPath();
            URL = URL.substring(path.length() + 1, URL.length());
            System.out.println(URL);

            //check if the URI end with .jsp or not,
            if (URL.endsWith(".jsp")) {
                if (URL.equals("contact.jsp")) {
                    resp.sendRedirect("contact");
                } else  {
                    resp.sendRedirect("home");
                }
            } else {
                chain.doFilter(request, response);
            }

        } catch (Exception e) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    @Override
    public void destroy() {
    }

}
