package lab;

public class Periodicle extends LibraryItem {
    private int issueNum;


    public Periodicle(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, int issueNum){
        super(id, loc, title, isAvailable, isLoanable, numOfPages);
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