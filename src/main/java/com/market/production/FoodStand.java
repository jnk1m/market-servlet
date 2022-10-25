package com.market.production;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FoodStand extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    resp.setCharacterEncoding("UTF-8");

    List<Food> foodList = (List<Food>)getServletContext().getAttribute("foodList");

    resp.setContentType("text/html");
    resp.setCharacterEncoding("UTF-8");

    resp.getWriter().println("상품    |  가격  |    재고 "+"<br/>");
    resp.getWriter().println("----------------------"+"<br/>");
    resp.getWriter().println("<form action=\"basketServlet\" method=\"POST\">");


    for (Food food : foodList) {
      resp.getWriter().println(food.getName()+" | "+food.getPrice()+"원 | "+food.getQuantity()+"개 <br/>"+
              "<input type=\"number\" name=\"quantity\">");
    }

    resp.getWriter().println("<input type=\"submit\" value=\"제출\">");
    resp.getWriter().println("</form>");





  }
}
