package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class OrderProgram {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os = OrderStatus.DELIVERED;
		OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println("OS: " + os + "\nOS1: " + os1);

	}

}
