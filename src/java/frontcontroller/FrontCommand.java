package frontcontroller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class FrontCommand {
    protected ServletContext context;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    
    public void init(ServletContext context, HttpServletRequest request, HttpServletResponse response) {
        this.context = context;
        this.request = request;
        this.response = response;
    }
    
    public void forward(String target) {
        RequestDispatcher dispatcher = context.getRequestDispatcher(target);
        try {
            dispatcher.forward(request, response);
        } catch (IOException | ServletException exception) {
            //TODO: redirect status code 500
        }
    }
    
    public void redirect(String target) {
        try {
            response.sendRedirect(target);
        } catch (IOException exception) {
            //TODO: redirect status code 500
        }
    }
    
    abstract public void process();
}
