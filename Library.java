public class Library {

    public static void main(String[] args) {

        Author author1 = new Author("Michael", "Brown");
        PublishingCompany pub1 = new PublishingCompany("ExelPrint");


        LibraryItem book1 = new GeneralBook(1, "A.200.1", "Some title 1", true, 438, "HardCover", "Adventure", author1,
                pub1);
        LibraryItem book2 = new GeneralBook(2, "A.200.1", "Some title 1", true, 438, "HardCover", "Adventure", author1,
                pub1);

        System.out.println("\n"+book1.toString()+"\n");
        
        CardHolder person1 = new CardHolder("James", "Bond", "JB001");
        CardHolder person2 = new CardHolder("Kevin", "Stoner", "KS001");
        
        person1.itemCheckOut(book1);
        
        System.out.println("\n"+book1.toString()+"\n");
        System.out.println("\n"+book2.toString()+"\n");
        
        person1.itemReturn(book1);

        System.out.println("\n"+book1.toString()+"\n");
        
        Loanable book3 = new GeneralBook(2, "B.100.5", "Star Saga", true, 843, "HardCover", "Sci-Fi", author1, pub1);
        
        System.out.println("\n"+book3.toString()+"\n");
        System.out.println("Loan duration is "+book3.getLoanDuration()+" days.");
        System.out.println("Overdue fees are $"+book3.getOverdueFee()+" per week.");
        
        person2.itemCheckOut(book3);








    }
    
}