package parking;

public class Parking {
    public static final int PRECO_FIXO = 8;
    public  String plate;
    public String veihicleType;
    public int minutes;


    public  double parking_calculator(){

        int horas = minutes / 60;
        int resto = minutes % 60 ;


        if (resto > 0){
            horas++;
        }
        double valor = PRECO_FIXO + (horas -1) * 5;

        if (veihicleType.equals("moto")){
            double v = valor * 0.90;
            return v;
        }

        return valor;

    }
}
