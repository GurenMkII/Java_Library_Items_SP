package lab;

public class Book extends LibraryItem {
    private String coverType;

    public Book(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, String coverType){
        super(id, loc, title, isAvailable, isLoanable, numOfPages);
    }
        
        public String getCoverType(){
            return this.coverType;
        }
        
        public void setCoverType(String coverType){
            this.coverType = coverType;
        }


}