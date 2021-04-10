public class CarLoan {
  //monthly car payment calculator with predefined vars
  public static void main(String[] args) {
      int carLoan = 10000;
      int loanLength = 3; //represents 3 years
      int interestRate = 5; //5%
      int downPayment = 2000;

      if (loanLength <= 0 || interestRate <= 0){
        System.out.println("Ain't got no valid car loan, ya hear?'");
      }else if (downPayment >= carLoan){
        System.out.println("this car can be paid for, ya hear?");
      }else{
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println("The monthly payment is: " + monthlyPayment);
      }

	}
}
