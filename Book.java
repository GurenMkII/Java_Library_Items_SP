public class Book extends LibraryItem {
    private String coverType;

    public Book(int id, String loc, String title, boolean isAvailable, int numOfPages, String coverType, Author authorName, PublishingCompany pubName){
        super(id, loc, title, isAvailable, numOfPages, authorName, pubName);
    }

    public Book(){
    }
        
        public String getCoverType(){
            return this.coverType;
        }
        
        public void setCoverType(String coverType){
            this.coverType = coverType;
        }


}