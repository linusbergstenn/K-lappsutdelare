package Kölappsutdelare1;

public class QueueTicketDispenser {
    //static private int objectCount = 0;
    static private int nr = 1;
    
/*    public QueueTicketDispenser(){
        
        if(objectCount > 0){
            System.out.println("Fler än ett objekt skapat");
            System.exit(0);
        }
        nr = 1;
        objectCount++;
        
    }*/
    
    public int getNextNumber(){
        return nr++;
    }
    
    
}
