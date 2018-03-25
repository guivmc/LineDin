
package filadin;


public class Note 
{
    private int dado;
    
    private Note next;
    
    public Note(int dado)
    {
        this.dado = dado;
        this.next = null;
    }

    //Getters
    public int getDado()
    {
        return dado;
    }

    public Note getNext()
    {
        return next;
    }
    
    //Setters
    public void setDado(int dado) 
    {
        this.dado = dado;
    }

    public void setNext(Note next) 
    {
        this.next = next;
    }
    
}
