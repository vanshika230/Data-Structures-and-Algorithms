import java.util.*;

import java.io.*;
public class Main
{
  public class Node
  {
    int data;  //for storing the data
    ArrayList< Node> children = new ArrayList< >(); //for storing the child nodes
  }
  public static void main(String[] args)
  {
    Node root; //unique node for a tree
    int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
    Stack< Node> st = new Stack< >();
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == -1)
      {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);

        }
        else
        {
          root = t;
        }
        st.push(t);
      }
    }
  }
}
