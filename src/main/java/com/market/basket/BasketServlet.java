package com.market.basket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BasketServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/plain");
    resp.setCharacterEncoding("UTF-8");
    resp.getWriter().println(req.getParameter("quantity"));

    /*
- 상품 수량보다 더 많은 주문을 하지 않았는 지 검증 -> 어트리뷰트에서 푸드 리스트 가지고 와서 for문 돌린 다음에 getQty 하고
받아온 값이랑 비교하기

- 장바구니에 담은 수량만큼 상품매대에서 제거 처리 -> setAttr
- 응답 화면에 장바구니 화면으로 이동할 수 있는 링크 제공 -> setRedirect
- 세션에 담기
     */
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //응답에 장바구니에 담긴 상품 목록과 전체 금액 표시 -> session에 있는거 보여주기
  }
}
