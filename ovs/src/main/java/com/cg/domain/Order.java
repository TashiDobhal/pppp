package com.cg.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@Column(name="orderNo")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNo;
    private int customerId;
	private double totalAmount;
	private LocalDateTime orderDate;
	private String status;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime localDateTime) {
		this.orderDate = localDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
