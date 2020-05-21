package lab;

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


    public String previewItem(String cardId, String title){
        System.out.println(this.getFirstName()+" checking out - "+LibraryItem.getTitle()); //??? stuck here...
    }

    
}