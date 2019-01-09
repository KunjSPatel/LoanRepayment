
import java.util.Scanner;

// T E S T E R ( M A I N  M E T H O D)
//Kunj Patel
//Loan Repayment Lab
//N01225943
//Numeric Computing
public class LoanTester {

    
    public static void main(String[] args) {
        
        
        //Object of the LoanCLass
        LoanClass loan = new LoanClass(1600,3.5,300);
        
        //Calling the method
        loan.printLoanRepaymentSchedule();
        
        
    }
    
}
