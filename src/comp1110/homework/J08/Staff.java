package comp1110.homework.J08;

public class Staff {

    private String Name;
    private double hourlyPay;
    private int numOfHours;
    private boolean worksOvertime;
    WeekendPayCalculator weekendPayCalculator;

    public static class WeekendPayCalculator{
        private double LodadingRate;
        public void setLoadingRate(double rate){
            this.LodadingRate=rate;
        }
        public double calcOvertime(double hourlyPay){
            return this.LodadingRate*hourlyPay;
        }
    }



    public Staff(String name, double hourlyPay, int numOfHours, boolean worksOvertime){
        this.Name = name;
        this.hourlyPay=hourlyPay;
        this.numOfHours = numOfHours;
        this.worksOvertime = worksOvertime;
        this.weekendPayCalculator = new WeekendPayCalculator();
    }

    public String getName(){
        return this.Name;
    }

    public double getTotalPay(double extraPay){
        double totalpay = 0;
        double overtime = this.weekendPayCalculator.calcOvertime(this.hourlyPay);
        if (this.worksOvertime==true) {
            totalpay =overtime+extraPay+this.hourlyPay*this.numOfHours;
        } else {
            totalpay=this.hourlyPay*this.numOfHours;
        }
            return totalpay;
        }







}


