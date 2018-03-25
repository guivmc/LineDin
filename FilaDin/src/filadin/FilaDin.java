
package filadin;


public class FilaDin {

   
    public static void main(String[] args) 
    {
        Line l = new Line();
        
        l.enqueue(1);
        l.enqueue(2);
        
        System.out.println(l.show());
        
        System.out.println(l.dequeue());
         System.out.println(l.dequeue());
    }
    
}
