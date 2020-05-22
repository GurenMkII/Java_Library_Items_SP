interface Loanable {

    boolean isLoanable();
    int getLoanDuration();
    default double getOverdueFee(OverdueFeeFreq x){
        double p = 0;

        switch(x){
            case DAILY:
                p = 0.50;
                break;
            case WEEKLY:
                p = 4.99;
                break;
            case MONTHLY:
                p = 19.99;
                break;
            default:
        }
        return p;
    }
    
}