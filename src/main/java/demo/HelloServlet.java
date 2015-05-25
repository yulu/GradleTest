package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yulu on 25/5/15.
 */
@WebServlet(name="Hello", urlPatterns = "/")
public class HelloServlet extends HttpServlet {
  private final Hello hello = new Hello();

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String hello = this.hello.sayHello();
    response.getWriter().write(hello);
  }
}
