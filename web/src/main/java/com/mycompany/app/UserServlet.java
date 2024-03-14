package main.java.com.mycompany.app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        var user = userService.getUser(1L);
        res.setContentType("text/html");
        var writer = res.getWriter();
        writer.write("<html><body>");
        writer.write("<h1> User </h1>");
        writer.write("<h2?>" + user.get().getName() + "</h2>");
        writer.write("</html></body>");
        writer.close();
    }
}
