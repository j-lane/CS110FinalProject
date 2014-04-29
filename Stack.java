public class Stack{
   
   public static void main(String [] args){
      Node head = null;
      Node n1 = new Node(new Integer(99));
      head = n1;
      Node n2 = new Node(new Integer(35));
      n1.setNext(n2);
      System.out.println(head.getNext());
      System.out.println(n1.getItem());
      System.out.println(n2.getItem());
      System.out.println(head.getItem());
      System.out.println(n2.getNext());
      
      

      
      
   }


}


