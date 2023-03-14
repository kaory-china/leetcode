public class RealListNodeMain {

  public static void main(String[] args) {
    RealListNode list = new RealListNode();

    System.out.println("Lista Inicial");
    list.print(list);

    System.out.println("Adicionando 5 no HEAD");
    list.addToHead(list, new ListNode(5));
    list.addToHead(list, new ListNode(6));
    list.addToHead(list, new ListNode(7));
    list.print(list);

    System.out.println("Adicionando 0 no TAIL");
    list.addToTail(list, new ListNode(0));
    list.print(list);

  }
}
