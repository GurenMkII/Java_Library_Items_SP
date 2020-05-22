interface Loanable {

    boolean isLoanable();
    int getLoanDuration();
    default double getOverdueFee(){
        return 4.99;
    }
    
}