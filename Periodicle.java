package lab;

public class Periodicle extends LibraryItem {
    private String releaseFreq;


    public Periodicle(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, String releaseFreq){
        super(id, loc, title, isAvailable, isLoanable, numOfPages);
    }

    public void setReleaseFreq(String releaseFreq){
        this.releaseFreq = releaseFreq;
    }

    public String getReleaseFreq(){
        return this.releaseFreq;
    }
    
}