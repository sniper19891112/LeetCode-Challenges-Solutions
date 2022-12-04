/*
        Write a function to delete a node in a singly-linked list. 
        You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
        It is guaranteed that the node to be deleted is not a tail node in the list.

        Example 1: 
                        4 ---> 5 ---> 1 ---> 9
                                ↓
                        4 ---> 1 ---> 9

        Input: head = [4, 5, 1, 9], node = 5
        Output: [4, 1, 9]
        Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

        Example 2:
                        4 ---> 5 ---> 1 ---> 9
                                ↓
                        4 ---> 5 ---> 9

        Input: head = [4, 5, 1, 9], node = 1
        Output: [4, 5, 9]
        Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

        Example 3:
                        1 ---> 2 ---> 3 ---> 4
                                ↓
                        1 ---> 2 ---> 4

        Input: head = [1, 2, 3, 4], node = 3
        Output: [1, 2, 4]

        Example 4:
                        0 ---> 1
                           ↓
                        1
        Input: head = [0, 1], node = 0
        Output: [1]
        
        Example 5:
                       -3 ---> 5 ---> -99
                               ↓
                        5 ---> -99
        Input: head = [-3, 5, -99], node = -3
        Output: [5, -99]

        Constraints:
                1) The number of the nodes in the given list is in the range [2, 1000].
                2) -1000 <= Node.val <= 1000
                3) The value of each node in the list is unique.
                4) The node to be deleted is in the list and is not a tail node
*/
/*
        // Definition for Singly-Linked List
        public class ListNode
	{
                int val;
                ListNode next;
                public ListNode()
                {
                }
                public ListNode( int val )
                {
                        this.val = val;
                }
                public ListNode( int val, ListNode next )
                {
                        this.val = val;
                        this.next = next;
                }
        }
*/
class Solution 
{
        public void deleteNode(ListNode node) 
        {
                node.val = node.next.val;
                node.next = node.next.next;
        }
}