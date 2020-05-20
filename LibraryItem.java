package lab;

public class LibraryItem {
    private int id;
    private String loc, title;
    private boolean isLoanable, isAvailable;


    public LibraryItem(int id, String loc, String title, boolean isAvailable, boolean isLoanable){
        this.id = id;
        this.loc = loc;
        this.title = title;
        this.isAvailable = isAvailable;
        this.isLoanable = isLoanable;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setLoc(String loc){
        this.loc = loc;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setIsLoanable(boolean isLoanable){
        this.isLoanable = isLoanable;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public int getId(){
        return id;
    }
    public String getLoc(){
        return loc;
    }
    public String getTitle(){
        return title;
    }
    public boolean getIsLoanable(){
        return isLoanable;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }


    
}