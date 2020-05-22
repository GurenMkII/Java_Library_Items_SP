public class NewsPaper extends Periodicle {
    private String originCity;

    public NewsPaper(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, int issueNum, String originCity, Author authorName, PublishingCompany pubName){
        super(id, loc, title, isAvailable, numOfPages, issueNum, authorName, pubName);
    }

    public void setOriginCity(String originCity){
        this.originCity = originCity;
    }

    public String getOriginCity(){
        return this.originCity;
    }
    
}