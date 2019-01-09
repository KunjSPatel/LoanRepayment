// J A V A  C L A S S 
//Kunj Patel
//Loan Repayment Lab
//N01225943
//Numeric Computing
public class LoanClass {

    //Fields
    private double AmountValue;
    private double rate;
    private double installment;       
    
    //Overloaded Constructor
    public LoanClass(double loanAmountValue, double rateValue, double monthlyInstallmentValue){
        
        //Initialising Fields
        this.AmountValue=loanAmountValue;
        this.installment =monthlyInstallmentValue;
        this.rate=rateValue;
    
    }//Constructor Ends
    
    
    //Method
    public void printLoanRepaymentSchedule(){
        
        //Prints the first lines of output
        System.out.println("\t\t\t\t L O A N  S C H E D U L E\n");
        System.out.println("Payment Number|Balance before Payment|Amount payment"
                + "|Interest Paid|Principal repaid|Balance after Payment|");
        System.out.println("--------------|" + "----------------------|" + "--------------|" +
                    "-------------|" + "----------------|" + "---------------------|");
        
        
        
        //Variables to be used to find the loan repayment schedule
        int paymentNo = 0;
        double moneyPrior = AmountValue;
        double moneyAfter;
        double totalMoney = 0;
        double moneyPaid = this.getInstallment();
        double interestPaid ;
        double totalInterest = 0;
        double principleRepaid;
        
        
        //For loop for printing again and again
         for(int i = 1;moneyPrior > moneyPaid;i++){
        
        //The formula for calculation 
        interestPaid = this.getRate()/100/12*moneyPrior;
        
        //Calculating totals: Just because we need to print the total at the end
        totalMoney += installment; 
        totalInterest += interestPaid;
         
        //Principle Repaid
        principleRepaid = moneyPaid - interestPaid;
        moneyAfter = moneyPrior - principleRepaid;    
        
        //Prints the output in the format
        System.out.printf(" %-13d|%22.2f|%14.2f|%13.2f|%16.2f|%21.2f|\n",i,moneyPrior,moneyPaid,interestPaid,principleRepaid,moneyAfter);
        
        //Just because the last case is going to be unique everytime
        moneyPrior  = moneyAfter;
        //For the last case as it is going to be out of the for loop
        paymentNo = i;    
        }
        
        
        //for the L A S T  L I N E 
        
        //Incrementing
        paymentNo++;
        //Formula and rest of the things are same
        interestPaid = this.getRate()/100/12*moneyPrior;
        principleRepaid = moneyPrior;
        moneyPaid = principleRepaid+interestPaid;
        totalMoney = totalMoney + moneyPaid;
        moneyAfter = 0;
        totalInterest += interestPaid;
        
        //This prints according to the format again
        System.out.printf(" %-13d|%22.2f|%14.2f|%13.2f|%16.2f|%21.2f|\n",paymentNo,moneyPrior,moneyPaid,interestPaid,principleRepaid,moneyAfter);
        System.out.printf("Totals:"+"%46.2f|%13.2f|%16.2f|\n",totalMoney, totalInterest, getAmountValue());
    
    }//Method Ends

    //Getters and Setter for getting and setting the value
    public double getAmountValue() {
        return AmountValue;
    }

    
    public void setAmountValue(double AmountValue) {
        this.AmountValue = AmountValue;
    }

    
    public double getRate() {
        return rate;
    }

    
    public void setRate(double rate) {
        this.rate = rate;
    }

    
    public double getInstallment() {
        return installment;
    }

    
    public void setInstallment(double installment) {
        this.installment = installment;
    }

    
}
