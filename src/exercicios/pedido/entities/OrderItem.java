package exercicios.pedido.entities;

public class OrderItem{
    private int quantity;
    private double price;

    public double subTotal(){
        double subtotal = quantity*price;
        return subtotal;
    }
}
