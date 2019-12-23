package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus os;
	
	public Order() {

	}

	public Order(Integer id, Date moment, OrderStatus os) {
		this.id = id;
		this.moment = moment;
		this.os = os;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOs() {
		return os;
	}

	public void setOs(OrderStatus os) {
		this.os = os;
	}
	
	public String convertData(Date data) {		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return sdf.format(data);
	}

	@Override
	public String toString() {
		return "Order ID: " + id 
				+ "\nData:" + this.convertData(moment) 
				+ ", Order Status: " + os;
	}	
	
}
