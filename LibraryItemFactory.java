public class LibraryItemFactory {

    public static LibraryItem createLibraryItem(LibraryItemTypes type){

        LibraryItem l = null;

        if(type == null){
            return null;
        }

        switch (type){

            case GENERALBOOK:
                l = new GeneralBook();
                break;
            case REFERENCEBOOK:
                l = new ReferenceBook();
                break;
            case MAGAZINE:
                l = new Magazine();
                break;
            case NEWSPAPER:
                l = new NewsPaper();
                break;
            default:

        }

        return l;

    }
    
}