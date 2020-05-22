public class Periodicle extends LibraryItem {
    private int issueNum;


    public Periodicle(int id, String loc, String title, boolean isAvailable, int numOfPages, int issueNum, Author authorName, PublishingCompany pubName){
        super(id, loc, title, isAvailable, numOfPages, authorName, pubName);
    }

    public Periodicle(){
    }

    public void setIssueNum(int issueNum){
        this.issueNum = issueNum;
    }

    public int getIssueNum(){
        return this.issueNum;
    }

    @Override
    public String toString(){
        return this.getTitle()+", Issue: "+this.getIssueNum()+" - Located at: "+this.getLoc();
    }
    
}