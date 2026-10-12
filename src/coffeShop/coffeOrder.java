package coffeShop;

public class coffeOrder {
    public String customerName;
    public String size;
    public int quantity;
    public boolean vegetableMilk;
    public String leite;

    public double calculateSubTotal() {
        double subtotal = 0;
        if (size.equals("Pequeno")) {
            subtotal = quantity * 6.00;

        } else if (size.equals("medio")) {
            subtotal = quantity * 9.00;


        } else if (size.equals("grande")) {
            subtotal = quantity * 12.00;


        }
        if (vegetableMilk) {
            subtotal += 2;


        }
        return subtotal;
    }

    public double calculateTotal() {
        double total = calculateSubTotal();
        if (total > 50.00) {
            double desconto = total * 0.9;
            return desconto;
        }
        return total;
    }

    public void validateOrder() {


    }

    public String toString() {
        double total = calculateTotal();
        double subtotal = calculateSubTotal();
        double desconto = subtotal - total;
        if (vegetableMilk) {
            leite = "Sim";
        } else {
            leite = "não";
        }

        return
                "\n"+
                "===== RESUMO DO PEDIDO =====" +
                        "\n" + "\n"+
                        "Cliente: " + customerName +
                        "\n"+
                        "Tamanho: " + size +
                        "\n"+
                        "Quantidade: " + quantity +
                        "\n"+
                        "Leite vegetal: " + leite +
                        "\n"+ "\n"+
                        "subtotal : R$ " + subtotal +
                        "\n"+
                        "Desconto:" + String.format("%.2f", desconto)
                        +"\n"+
                         "total" + String.format(" R$ %.2f", total);
    }


}

