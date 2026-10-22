package com.diworksdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.ecsite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
public Map<String, Object> session;
private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();



public String execute() throws SQLException {

    System.out.println("id=" + session.get("id"));
    System.out.println("total_price=" + session.get("total_price"));
    System.out.println("count=" + session.get("count"));
    System.out.println("login_user_id=" + session.get("login_user_id"));
    System.out.println("pay=" + session.get("pay"));

    buyItemCompleteDAO.buyItemeInfo(
            session.get("id").toString(),
            session.get("total_price").toString(),
            session.get("count").toString(),
            session.get("login_user_id").toString(),
            session.get("pay").toString());

    System.out.println("INSERT実行");

    return SUCCESS;
}
@Override
public void setSession(Map<String, Object> session) {
    this.session = session;
}
}