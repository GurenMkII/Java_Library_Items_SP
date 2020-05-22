public class Magazine extends Periodicle {
    private String mainTopic;

    public Magazine(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, int issueNum, String releaseFreq, String mainTopic, Author authorName, PublishingCompany pubName){
        super(id, loc, title, isAvailable, numOfPages, issueNum, authorName, pubName);
    }

    public Magazine(){
    }

    public void setMainTopic(String mainTopic){
        this.mainTopic = mainTopic;
    }

    public String getMainTopic(){
        return this.mainTopic;
    }
    
}