public class GeneralBook extends Book {
    private String genre;
    

    public GeneralBook(int id, String loc, String title, boolean isAvailable, int numOfPages, String coverType, String genre, Author authorName, PublishingCompany pubName){
        super(id, loc, title, isAvailable, numOfPages, coverType, authorName, pubName);
    }

    public GeneralBook() {
	}

	public String getGenre(){
        return this.genre;
    }
    
}