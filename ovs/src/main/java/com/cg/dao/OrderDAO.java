package com.cg.dao;

import java.util.List;

import com.cg.domain.Order;

public interface OrderDAO {
	public void addOrder(Order order);
	public void updateOrderDetails(Order order);
	public void cancelOrder(Order order);
    public void viewOrder(Order order);
	public List<Order> viewAllOrders(int customerId);
	
}
