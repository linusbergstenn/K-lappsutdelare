package Kölappsutdelare1;

public class QueueTicketDispenser {
    //static private int objectCount = 0;
    private int nr;
    private static QueueTicketDispenser dispenser;
    
    public static QueueTicketDispenser getInstance(){
        if(dispenser == null)
            dispenser = new QueueTicketDispenser();
        return dispenser;
        
    }
    
   private QueueTicketDispenser(){
        
        /*if(objectCount > 0){
            System.out.println("Fler än ett objekt skapat");
            System.exit(0);
        }
        nr = 1;
        objectCount++;*/
        nr = 1;
        
    }
    
    public int getNextNumber(){
        return nr++;
    }
    
    
}
