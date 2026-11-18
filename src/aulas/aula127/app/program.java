package aulas.aula127.app;

import aulas.aula127.entities.Order;
import aulas.aula127.entities.enums.OrderStatus;

import java.util.Date;

public class program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
