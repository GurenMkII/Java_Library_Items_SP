package lab;

public class NewsPaper extends Periodicle {
    private String originCity;

    public NewsPaper(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, int issueNum, String originCity){
        super(id, loc, title, isAvailable, isLoanable, numOfPages, issueNum);
    }

    public void setOriginCity(String originCity){
        this.originCity = originCity;
    }

    public String getOriginCity(){
        return this.originCity;
    }
    
}