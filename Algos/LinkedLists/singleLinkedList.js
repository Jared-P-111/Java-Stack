//prettier-ignore
// const myLinkedList = new Node( 1,new Node(2,new Node(3,null)));

class Node {
  constructor(data, next = null) {
    this.data = data;
    this.next = next;
  }
}

/**
 * This class keeps track of the start (head) of the list and to store all the
 * functionality (methods) that each list should have.
 */
class SinglyLinkedList {
  constructor() {
    this.head = null;
  }

  /**
   * Determines if this list is empty.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {boolean}
   */
  isEmpty() {
    if (this.head === null) return true;
    else {
      return false;
    }
  }

  /**
   * Creates a new node with the given data and inserts it at the back of
   * this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} data The data to be added to the new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtBack(data) {
    //🧈This is creating a node.
    const newNode = new Node(data);

    //🧈Check if the list is empty if it is point the head at our node above.
    if (this.isEmpty()) {
      this.head = newNode;
    } else {
      let temp = this.head;

      //🧈moves us forward ===>
      while (temp.next) {
        temp = temp.next;
        console.log();
      }
      temp.next = newNode;
    }
  }

  /**
   * Creates a new node with the given data and inserts it at the back of
   * this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} data The data to be added to the new node.
   * @param {?ListNode} runner The current node during the traversal of this list
   *    or null when the end of the list has been reached.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtBackRecursive(data, runner = this.head) {}

  /**
   * Calls insertAtBack on each item of the given array.
   * - Time: O(n * m) n = list length, m = arr.length.
   * - Space: O(1) constant.
   * @param {Array<any>} vals The data for each new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtBackMany(vals) {
    for (const item of vals) {
      this.insertAtBack(item);
    }
    return this;
  }

  /* Creates a new node with the given data and inserts that node at the front
   * of this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} data The data for the new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtFront(data) {
    const newHead = new Node(data);
    newHead.next = this.head;
    this.head = newHead;
  }

  removeHead() {
    if (this.isEmpty()) return null;
    let currHead = this.head;

    this.head = currHead.next;

    return currHead.data;
  }

  /**
   * Converts this list into an array containing the data of each node.
   * - Time: O(n) linear.
   * - Space: O(n).
   * @returns {Array<any>} An array of each node's data.
   */
  toArr() {
    const arr = [];
    let runner = this.head;

    while (runner) {
      arr.push(runner.data);
      runner = runner.next;
    }
    return arr;
  }
}

/******************************************************************* 
  Multiple test lists already constructed to test your methods on.
  Below commented code depends on insertAtBack method to be completed,
  after completing it, uncomment the code.
  */

// const emptyList = new SinglyLinkedList();
// const singleNodeList = new SinglyLinkedList().insertAtBackMany([1]);
// const biNodeList = new SinglyLinkedList().insertAtBackMany([1, 2]);
// const firstThreeList = new SinglyLinkedList().insertAtBackMany([1, 2, 3]);
// const secondThreeList = new SinglyLinkedList().insertAtBackMany([4, 5, 6]);
const unorderedList = new SinglyLinkedList().insertAtBackMany([-5, -10, 4, -3, 6, 1, -7, -2]);

// /* node 4 connects to node 1, back to head */
// const perfectLoopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
// perfectLoopList.head.next.next.next = perfectLoopList.head;

/* node 4 connects to node 2 */
// const loopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
// loopList.head.next.next.next = loopList.head.next;

// const sortedDupeList = new SinglyLinkedList().insertAtBackMany([1, 1, 1, 2, 3, 3, 4, 5, 5]);

// Print your list like so:
// console.log(firstThreeList.toArr());

const SLL = new SinglyLinkedList();
// const node1 = new Node(1);
// const node2 = new Node(2);
// const node3 = new Node(3);

//SLL.head = node1;
// console.log(SLL);
SLL.insertAtBack(2);
// console.log('SLL Head -> ', SLL, 'SLL.head.next -> ', SLL.head.next);
SLL.insertAtBack(3);
// console.log('SLL Head -> ', SLL, 'SLL.head.next -> ', SLL.head.next);

SLL.insertAtFront(0);
console.log('SLL Head ==> ', SLL);

console.log(SLL.removeHead());
console.log('SLL Head ==> ', SLL);
