interface Reserveable {
    
    boolean isReserveable();
    default int getReserveDuration(){
        return 2;
    }

}