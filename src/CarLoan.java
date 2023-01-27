    public class CarLoan {
        int carLoan, loanLength, interestRate, downPayment;

        public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment){
            this.carLoan = carLoan;
            this.loanLength = loanLength;
            this.interestRate = interestRate;
            this.downPayment = downPayment;
        }

        //a method that prevent a buyer from taking out an invalid car loan
        public void loanValidity(){
            if(loanLength<=0 || interestRate<=0){
                System.out.println("Error! You must take out a valid car loan.");
            }else if(downPayment>=carLoan){
                System.out.println("The car can be paid in full.");
            }else{
                int remainingBalance = carLoan-downPayment;
                int months = loanLength * 12;
                int monthlyBalance=remainingBalance/months;
                int interest = (monthlyBalance * interestRate)/100;
                int monthlyPayment = monthlyBalance + interest;
                System.out.println("The monthly payment is: "+monthlyPayment);
            }

        }


    }

