public class MergeTwoSortedLists {

  //
  // comparo primeiro elemento da lista 1 com primeiro elemento da lista 2
  // adiciono no final da lista o menor elemento
  // passo para o proximo elemento da lista que originou o menor elemento
  // adiciono o menor elemento no final da lista final
  // caso termine de percorrer alguma lista, adiciono os elementos restantes ao final da lista final

  public static void main(String[] args) {
    ListNode ln3 = new ListNode(4, null);
    ListNode ln2 = new ListNode(2, ln3);
    ListNode ln1 = new ListNode(1, ln2);

    ListNode ln4 = new ListNode(4, null);
    ListNode ln5 = new ListNode(3, ln4);
    ListNode ln6 = new ListNode(1, ln5);

    System.out.println(mergeTwoLists(ln1, ln6));
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode firstNode = null;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        firstNode = addNode(firstNode, list1.val);
        list1 = list1.next;
      } else {
        firstNode = addNode(firstNode, list2.val);
        list2 = list2.next;
      }
    }
    if (list1 == null && list2 != null) {
      firstNode = addNode(firstNode, list2.val);
      list2 = list2.next;
      while (list2 != null) {
        firstNode = addNode(firstNode, list2.val);
        list2 = list2.next;
      }

      return firstNode;
    }
    if (list2 == null && list1 != null) {
      firstNode = addNode(firstNode, list1.val);
      list1 = list1.next;
      while (list1 != null) {
        firstNode = addNode(firstNode, list1.val);
        list1 = list1.next;
      }
      return firstNode;
    }
    return firstNode;
  }

  private ListNode addNode(ListNode list, int val) {
    if (list == null) {
      return new ListNode(val);
    }
    ListNode p = list;
    while (p.next != null) {
      p = p.next;
    }
    p.next = new ListNode(val);
    return list;
  }

}
