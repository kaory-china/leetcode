import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeTwoSortedListsV {

  public static void main(String[] args) {
    ListNode ln3 = new ListNode(4, null);
    ListNode ln2 = new ListNode(2, ln3);
    ListNode ln1 = new ListNode(1, ln2);

    ListNode ln4 = new ListNode(4, null);
    ListNode ln5 = new ListNode(3, ln4);
    ListNode ln6 = new ListNode(1, ln5);

    System.out.println(mergeTwoListsV2(ln1, ln6));
  }

  public static ListNode mergeTwoLists(ListNode ln1, ListNode ln2) {
    Map<String, ListNode> headTail = new HashMap<>();
    ListNode head = null;
    ListNode tail = null;
    headTail.put("head", head);
    headTail.put("tail", tail);

    while (ln1 != null && ln2 != null) {
      if (ln1.val < ln2.val) {
        head = addNode(head, ln1.val);
        ln1 = ln1.next;
      } else {
        head = addNode(head, ln2.val);
        ln2 = ln2.next;
      }
    }
    if (ln1 == null) {
      while (ln2 != null) {
        head = addNode(head, ln2.val);
        ln2 = ln2.next;
      }
      printNodes(head);
      return head;
    }
    if (ln2 == null) {
      while (ln1 != null) {
        head = addNode(head, ln1.val);
        ln1 = ln1.next;
      }
      printNodes(head);
      return head;
    }
    return head;
  }

  private static ListNode addNode(ListNode node, int val) {
    if (node == null) {
      return new ListNode(val);
    }
    ListNode p = node;
    while (p.next != null) {
      p = p.next;
    }
    ListNode last = new ListNode(val);
    p.next = last;
    return node;
  }

  //////////////////////////////////
  public static ListNode mergeTwoListsV2(ListNode ln1, ListNode ln2) {
    Map<String, ListNode> headTail = new HashMap<>();
    ListNode head = null;
    ListNode tail = null;
    headTail.put("head", head);
    headTail.put("tail", tail);

    while (ln1 != null && ln2 != null) {
      if (ln1.val < ln2.val) {
        headTail = addNode(headTail, ln1.val);
        ln1 = ln1.next;
      } else {
        headTail = addNode(headTail, ln2.val);
        ln2 = ln2.next;
      }
    }
    if (ln1 == null) {
      while (ln2 != null) {
        headTail = addNode(headTail, ln2.val);
        ln2 = ln2.next;
      }
      printNodes(headTail.get("head"));
      return headTail.get("head");
    }
    if (ln2 == null) {
      while (ln1 != null) {
        headTail = addNode(headTail, ln1.val);
        ln1 = ln1.next;
      }
      printNodes(headTail.get("head"));
      return headTail.get("head");
    }
    return headTail.get("head");
  }

  private static Map<String, ListNode> addNode(Map<String, ListNode> headTail, int val) {

    if (headTail.get("head") == null) {
      ListNode head = new ListNode(val);
      headTail.put("head", head);
      return headTail;
    }

    if (headTail.get("tail") == null) {
      ListNode head = headTail.get("head");
      ListNode newNode = new ListNode(val);
      head.next = newNode;
      headTail.put("tail", newNode);
      return headTail;
    }

    ListNode lastNode = headTail.get("tail");
    ListNode newNode = new ListNode(val);
    lastNode.next = newNode;
    headTail.put("tail", newNode);
    return headTail;
  }

  private static void printNodes(ListNode node) {
    while (node != null) {
      System.out.println("LIST NODE VAL = " + node.val);
      node = node.next;
    }
  }

}
