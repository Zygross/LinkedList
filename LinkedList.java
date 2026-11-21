class LinkedList 
{
    node start;
    LinkedList ()
    {
        start=null;
    }
    public  void create ()
    {
        node n1=new node(10);
        node n2=new node (20);
        node n3=new node (30);
        start =n1;
        n1.next=n2;
        n2.next=n3;
    }
    public void display ()
    {
        node ptr=start;
        while(ptr!=null)
        {
            System.out.println (ptr);
            ptr=ptr.next;
        }
    }
}