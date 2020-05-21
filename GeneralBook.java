package lab;

public class GeneralBook extends Book {
    private String genre;

    public GeneralBook(int id, String loc, String title, boolean isAvailable, boolean isLoanable, int numOfPages, String coverType, String genre){
        super(id, loc, title, isAvailable, isLoanable, numOfPages, coverType);
    }

    public String getGenre(){
        return this.genre;
    }
    
}