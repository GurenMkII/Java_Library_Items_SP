public class LibraryItem implements Loanable, Reserveable {
    private int id, numOfPages;
    private String loc, title;
    private boolean isAvailable;
    private Author authorName;
    private PublishingCompany pubName;


    public LibraryItem(int id, String loc, String title, boolean isAvailable, int numOfPages, Author authorName, PublishingCompany pubName){
        this.id = id;
        this.loc = loc;
        this.title = title;
        this.isAvailable = isAvailable;
        this.numOfPages = numOfPages;
        this.authorName = authorName;
        this.pubName = pubName;
    }

    public LibraryItem(){
    }

    public void setId(int id){
        this.id = id;
    }
    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }
    public void setLoc(String loc){
        this.loc = loc;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public void setAuthorName(Author authorName){
        this.authorName = authorName;
    }
    public void setPubName(PublishingCompany pubName){
        this.pubName = pubName;
    }


    public int getId(){
        return id;
    }
    public int getNumOfPages(){
        return numOfPages;
    }
    public String getLoc(){
        return loc;
    }
    public String getTitle(){
        return title;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public Author getAuthorName(){
        return authorName;
    }
    public PublishingCompany getPubName(){
        return pubName;
    }

    @Override
    public String toString(){
        String avail;
        if(this.getIsAvailable()){
            avail = " This item is available now.";
        } else avail = " This item is not available at this time.";
  
        return this.getTitle()+" - Located at: "+this.getLoc()+";"+avail;
    }

    @Override
    public boolean isLoanable(){
        return true;
    }
    @Override 
    public int getLoanDuration(){
        return 7;
    }

    @Override
    public boolean isReserveable(){
        return true;
    }
    


    
}