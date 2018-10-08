/*
Pay.java
J Munster
8 10 2018
*/

public class Pay{
    //data members
    //variables
    private double basicRate;
    private double basicHours;
    private double overTimeHours;
    private double basicPay;
    private double overTimePay;
    private final double OVERTIMERATE;
    private double totalPay;

    //Constructor - setting values to the variables
    public Pay(){
        basicRate=0.00;
        basicHours=0.00;
        overTimeHours=0.00;
        basicPay=0.00;
        overTimePay=0.00;
        OVERTIMERATE=1.50;
        totalPay=0.00;
    }

    //Setters
    public void setBasicRate(double basicRate){
        this.basicRate=basicRate;
    }

    public void setBasicHours(double basicHours){
        this.basicHours=basicHours;
    }

    public void setOverTimeHours(double overTimeHours){
        this.overTimeHours=overTimeHours;
    }

    //Compute
    public void compute(){
        basicPay=(basicRate*basicHours);
        overTimePay=(overTimeHours*(basicRate*OVERTIMERATE));
        totalPay=(basicPay+overTimePay);
    }

    //Getters
    //basic pay
    public double getBasicPay(){
        return basicPay;
    }

	//overtime
    public double getOverTimePay(){
        return overTimePay;
    }

	//totaltime
    public double getTotalPay(){
        return totalPay;
    }

}//ends class