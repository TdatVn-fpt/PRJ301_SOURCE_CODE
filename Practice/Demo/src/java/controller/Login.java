package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = {"/login"}) // login là truyền vào, /login là truy cập vào
public class Login extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userChuaXuLi = request.getParameter("user"); //getParameter nhận giá trị từ thằng user
        String passChuaXuLi = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        String ms = "";
        if (userChuaXuLi.equalsIgnoreCase("admin") && passChuaXuLi.equals("123")) {
          ms += "Xin chào" + userChuaXuLi + "!!!";
        } else {
            ms += "Bạn nhập sai tên đăng nhập hoặc mật khẩu";
        }
        out.append("<h1>"+ms+"</h1>");
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
