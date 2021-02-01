package com.cg.main;

import java.time.LocalDateTime;

import com.cg.dao.OrderDAO;
import com.cg.daoImpl.OrderDAOImpl;
import com.cg.domain.Order;

public class OrderMain {
public static void main(String[] args) {
	OrderDAO or= new OrderDAOImpl();
	Order o= new Order();
	o.setCustomerId(1);
	o.setOrderDate(LocalDateTime.now());
	o.setStatus("pending");
	o.setTotalAmount(3000);
	or.addOrder(o);
}
}
