/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vaibhav
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String out = "---";
            request.setAttribute("out", out);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String first = request.getParameter("first");
       String second = request.getParameter("second");
        
       request.setAttribute("first", first);
       request.setAttribute("second", second);
        if(first == null || second == null || first.equals("") || second.equals("")){
            String out = "invalid";
            request.setAttribute("out", out);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else
        {
            try{
                int left=Integer.parseInt(first);
                int right=Integer.parseInt(second);
                
                int result=0;
                if(request.getParameter("equation").equals("+"))
  {
  result= left + right;
  }
                else if(request.getParameter("equation").equals("-"))
  {
   result = left - right; 
  }
  else if(request.getParameter("equation").equals("*"))
  {
    result= left * right; 
  }
  else if(request.getParameter("equation").equals("%"))
  {
   result = left % right;
  }
                
                
                String out =" " +  result;
                request.setAttribute("out",out);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
            }
            
           catch (NumberFormatException e){
                  
                  String out=" invalid";
           
           request.setAttribute("out", out);
           request.setAttribute("first", first);
           request.setAttribute("second", second);
         
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
    }
}
        
}
    
}