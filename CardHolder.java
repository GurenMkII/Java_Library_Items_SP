public class CardHolder {
    private String firstName, lastName, cardId;

    public CardHolder(String firstName, String lastName, String cardId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardId = cardId;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setCardId(String cardId){
        this.cardId = cardId;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getCardId(){
        return this.cardId;
    }

    // VSCode's "fix" helped with casts to get it working with Generics...
    public <E> void itemCheckOut(E book) {
        if(((LibraryItem) book).getIsAvailable() && ((LibraryItem) book).isLoanable()) {
            ((LibraryItem) book).setIsAvailable(false);
            System.out.println("\n"+this.getFirstName()+" "+this.getLastName()+" ("+this.cardId+")"+" is checking out - "+ ((LibraryItem) book)
                    .getTitle() + " (id: " + ((LibraryItem) book).getId() + ").\n");
        } else System.out.println("\nUnfortunately this item is not available or cannot be checked out.\n");
    }
    
    public void itemReturn(LibraryItem book){
            book.setIsAvailable(true);
            System.out.println("\n"+this.getFirstName()+" "+this.getLastName()+" ("+this.cardId+")"+" is returning - "+book.getTitle()+" (id: "+book.getId()+").\n");
    }
    
}