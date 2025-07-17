package com.codewithmosh.store;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext c=SpringApplication.run(StoreApplication.class, args);
		var orderService=c.getBean(OrderService.class);
		//context.getBean(orderService.class);
		//var orderService=new OrderService(new StripePaymentService());
		//var orderService=new OrderService(new PaypalPaymentService());
		//orderService.setPaymentService(new PaypalPaymentService());
		orderService.placeOrder();

		var notificationmanager=c.getBean(NotificationManager.class);
		notificationmanager.SendNotification();

	}

}
