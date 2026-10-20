package exercicios.Controle_de_consumo_de_energia.entities;

public class EnergyConsumption {
    private String  devicename;
    private double powerWatts;
    private double hoursPerDay;
    private int daysUsed;

    public double calculateKWh(){
        double consumo = powerWatts * hoursPerDay * daysUsed /1000;
        return consumo;
    }

    public double calculateCost(){
        double consumo = calculateKWh();
        double custo = consumo * 0.85;
        return custo;
    }

    public void  fieldsValidation(){
        if(hoursPerDay > 0 && hoursPerDay <= 24){
            System.out.print("ERRO HORARIO INVALIDO");
            System.exit(0);
        } else if (powerWatts <= 0 ) {
            System.out.print("ERRO POTENCIA MENOR OU IGUAL ZERO");
            System.exit(0);

        }
    }
    public void setDevicename(String devicename){
        this.devicename = devicename;

    }
    public String getDevicename(){
        return devicename;
    }

}
