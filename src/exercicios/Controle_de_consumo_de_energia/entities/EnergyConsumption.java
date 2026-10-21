package exercicios.Controle_de_consumo_de_energia.entities;

public class EnergyConsumption {
    private String  devicename;
    private double powerWatts;
    private double hoursPerDay;
    private int daysUsed;

    public EnergyConsumption(String devicename,double powerWattss,double hoursPerDay,int daysUsed) {
        this.devicename = devicename;
        this.powerWatts = powerWattss;
        this.hoursPerDay = hoursPerDay;
        this.daysUsed = daysUsed;

    }


    public double calculateKWh(){
        double consumo = powerWatts * hoursPerDay * daysUsed /1000;
        return consumo;
    }

    public double calculateCost(){
        double consumo = calculateKWh();
        double custo = consumo * 0.85;
        return custo;
    }

    public boolean fieldsValidation(){
        if(hoursPerDay <= 0 || hoursPerDay > 24){
            System.out.print("ERRO HORARIO INVALIDO");
            return false;

        } else if (powerWatts <= 0 ) {
            System.out.print("ERRO POTENCIA MENOR OU IGUAL ZERO");
            return false;


        } else if (daysUsed < 1 || daysUsed > 31) {
            System.out.println("ERRO DIA INVALIDO");
            return false;
        }
        return true;
    }
    public void setDevicename(String devicename){
        this.devicename = devicename;

    }
    public String getDevicename(){
        return devicename;
    }

    public double getConsumo(){
         return  calculateKWh();
    }

    public double getCusto(){
        return calculateCost();
    }
    @Override
    public String toString() {
        return "Aparelho :" +
                devicename
                + "\n Consumo: "+
                getConsumo()
                + "\n custo: R$ "+
                String.format("%.2f",getCusto());

    }

}
