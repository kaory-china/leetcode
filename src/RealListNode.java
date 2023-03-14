public class RealListNode {

  ListNode head;
  ListNode tail;

  public void print(RealListNode list) {
    ListNode head = list.head;
    while (head != null) {
      System.out.println("ListNode val = " + head.val);
      head = head.next;
    }
  }

  public RealListNode addToHead(RealListNode list, ListNode node) {
    if (list.head == null) {
      list.head = node;
      list.tail = node;
      return list;
    }
    // aponto o next do node a ser inserido para o atual head
    node.next = head;
    // atualizo a lista com o node como novo head
    list.head = node;
    return list;
  }

  public RealListNode addToTail(RealListNode list, ListNode node) {
    if (list.head == null) return addToHead(list, node);
    // pego o tail e aponto para o novo node
    list.tail.next = node;
    // atualizo o tail da lista
    list.tail = node;
    return list;
  }

}
