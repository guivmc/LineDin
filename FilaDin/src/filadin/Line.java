package filadin;

public class Line
{
    private Note head, last;
    
    public Line()
    {
        head = last = null;
    }
    
    //bools
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    //voids
    public void enqueue(int valor)
    {
        Note new_note = new Note(valor);    
        
        if(isEmpty()) 
        {
            head = last = new_note;
            return;
        }
        last.setNext(new_note);
        last = new_note;
    }
    
    //ints
    public int dequeue()
    {
        if(isEmpty()) return -1;
        if(head == last)
        {
            int iaux = head.getDado();
            head = last = null;
            return iaux;
        }     
        
        Note aux = head;
        head = head.getNext();
        return aux.getDado();
    }
    
    public String show()
    {
        Note aux = head; 
        String out = " ";
        while(aux != null)
        {
            out += aux.getDado() + " ";
            aux = aux.getNext();
        }
        return out;
    }
    
    //Getters
    public Note peek()
    {
        return head;
    }
    
    
}
