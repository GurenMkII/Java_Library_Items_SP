package lab;

public class Magazine extends Periodicle {
    private String mainTopic;

    public Magazine(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, String coverType, String releaseFreq, String mainTopic){
        super(id, loc, title, isAvailable, isLoanable, numOfPages, releaseFreq);
    }

    public void setMainTopic(String mainTopic){
        this.mainTopic = mainTopic;
    }

    public String getMainTopic(){
        return this.mainTopic;
    }
    
}