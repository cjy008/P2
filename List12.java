import java.util.*;    

public class List12<E> implements List<E> 
{
  private int size = 0;      // size of the list
  private Node<E> head = new Node<E>();
  private Node<E> node = new Node<E>(); //dummy linked list
  private int modCount = 0;             // modification count

  /**
   * Method that appends the specified element to the end of the list.
   * It will throw an UnsupportedOperationException if the add
   * operation is not supported by this list.
   * @param o element to be appended to this list
   */ 
  public boolean add(E o)
  {
    Node<E> cursor = head;
    while(node.getSuccessor() != null)
    {
      cursor = cursor.getSuccessor();
    }
    Node<E> newNode = new Node<E>(o, null);
    newNode.setSuccessor(cursor.getSuccessor());
    cursor.setSuccessor(newNode);
    size++;
    modCount++;
    return true;
/** another option if the above doesnt work
 * this.add(size,o);
 * size++;
 * return true;
 */
  }

  /**
   * Method to insert the specified element at the specified position in
   * this list. Shifts the element currently at that position and any
   * subsequent element to the right (adds one to their indices).
   * @param index index at which the specified element is to be inserted
   * @param element element to be inserted 
   */ 
  public void add(int index, E element)
  {
    if(index < 0 || index >= size())
    {
      throw new IndexOutOfBoundsException();
    }
    if(size == 0)
    {
      Node<E> newNode = new Node<E>(element, null);
      newNode.setSuccessor(head.getSuccessor());
      head.setSuccessor(newNode);
      size++;
      modCount++;
    }
    else
    {
      Node<E> cursor = head;
      while(node.getSuccessor() != null)
      {
        cursor = cursor.getSuccessor();
      }
      Node<E> newNode = new Node<E>(element, null);
      newNode.setSuccessor(cursor.getSuccessor());
      cursor.setSuccessor(newNode);
      size++;
      modCount++;
    }
  }

  /**
   * Method that returns true if and only if this list contains at least
   * one of the specified element.
   * @param o element whose presence in this list is to be tested
   * @return true if this list contains the specified element
   */
  public boolean contains(Object o)
  {
    Node<E> cursor = head;
    if(size == 0)
    {
      return false;
    }
    else
    {
      while(node.getSuccessor() != null)
      {
        cursor = cursor.getSuccessor();
        if(cursor.getData().equals(o) == true)
        {
          return true;
        }
      }
      return false;
    }
  }

  /**
   * Method that returns the element at the specified position in this list.
   * @param index the index of the element to return
   * @return the element at the specified position in this list
   */
  public E get(int index)
  {
    if(index < 0 || index >= size())
    {
      throw new IndexOutOfBoundsException();
    }
    Node<E> cursor = head;
    for(int i = 0; i<index; i++)
    {
      cursor = cursor.getSuccessor();
    }
    Node<E> target = cursor.getSuccessor();
    E element = target.getData();
    return element;
  }

  /**
   * Method that returns an iterator over the elements in this list in
   * proper sequence.
   * @return an iterator over the elements in this list in proper sequence
   */
  public Iterator<E> iterator()
  {
    Iterator<E> iterNode = iterator();
    return iterNode;
  } 

  /**
   * Method that removes the first occurrence of the specified element from
   * this list, if it is present. Returns true if this list contained the 
   * specified element.
   * @param o element to be removed from this list, if present
   * @return true if this list contained the specified element
   */
  public boolean remove(Object o)
  {
    Node<E> cursor = head;
    Node<E> target = cursor.getSuccessor();
    while(node.getSuccessor() != null)
    {
      if(target.getData().equals(o) == true)
      {
        cursor.setSuccessor(target.getSuccessor());
        size--;
        modCount--;
        return true;
      }
      cursor = cursor.getSuccessor();
      target = target.getSuccessor();
    }
    return false;
  } 

  /**
   * Method that removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left. Returns the element that
   * was removed from this list.
   * @param index the index of the element to be removed
   * @return the element previously at the specified position
   */  
  public E remove(int index)
  {
    if(index < 0 || index >= size())
    {
      throw new IndexOutOfBoundsException();
    }
    Node<E> cursor = head;
    for(int i = 0; i<index; i++)
    {
      cursor = cursor.getSuccessor();
    }
    Node<E> target = cursor.getSuccessor();
    E element = target.getData();
    cursor.setSuccessor(target.getSuccessor());
    size--;
    modCount--;
    return element;
  }

  /**
   * Method that replaces the element at the specified position in this
   * list with the specified element.
   * @param index index of the element to replace
   * @param element element to be stored at the specified position
   * @return the element previously at the specified position
   */ 
  public E set(int index, E element)
  {
    if(index < 0 || index >= size())
    {
      throw new IndexOutOfBoundsException();
    }
    Node<E> cursor = head;
    for(int i = 0; i<index; i++)
    {
      cursor = cursor.getSuccessor();
    }
    Node<E> target = cursor.getSuccessor();
    E data = target.getData();
    target.setData(element);
    return data;
  }
 
  /**
   * Method that returns the number of elements in this list.
   * @return the number of elements in this list
   */
  public int size()
  {
    return this.size;
  }  

  public List<E> subList(int fromIndex, int toIndex) throws
      UnsupportedOperationException
  {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(Collection<? extends E> c)
  {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(int index, Collection<? extends E> c)
  {
    throw new UnsupportedOperationException();
  }

  public void clear()
  {
    throw new UnsupportedOperationException();
  }

  public boolean containsAll(Collection<?> c)
  {
    throw new UnsupportedOperationException();
  }

  public boolean equals(Object o)
  {
    throw new UnsupportedOperationException();
  }

  public int hashCode()
  {
    throw new UnsupportedOperationException();
  }

  public int indexOf(Object o)
  {
    throw new UnsupportedOperationException();
  }

  public boolean isEmpty()
  {
    throw new UnsupportedOperationException();
  }

  public int lastIndexOf(Object o)
  {
    throw new UnsupportedOperationException();
  }

  public ListIterator<E> listIterator()
  {
    throw new UnsupportedOperationException();
  }

  public ListIterator<E> listIterator(int index)
  {
    throw new UnsupportedOperationException();
  }

  public boolean removeAll(Collection<?> c)
  {
    throw new UnsupportedOperationException();
  }

  public boolean retainAll(Collection<?> c)
  {
    throw new UnsupportedOperationException();
  }

  public Object[] toArray()
  {
    throw new UnsupportedOperationException();
  }

  public <T> T[] toArray(T[] a)
  {
    throw new UnsupportedOperationException();
  }

/////////////////////////////// Node Class///////////////////////////////////
  private static class Node<E>
  {
    private E data;        // the data field
    private Node<E> next;  // link to successor
    private int size = 0;

    /**
     * Create an empty Node object
     */
    public Node()
    {
      this.data = null;
      this.next = null;
    }

    /**
     * Create an Node that stores theElement whose successor
     * is theSuccessor.
     * @param theElement the element to store in this node
     * @param theSuccessor this node's successor
     */
     public Node(E theElement, Node<E> theSuccessor)
     {
       this.data = theElement;
       this.next = theSuccessor;
       this.size++;
     }

     /**
      * Successor accessor
      */
     public Node<E> getSuccessor()
     {
       return this.next;
     }

     /**
      * Successor mutator
      */
     public void setSuccessor(Node<E> n)
     {
       this.next = n;
     }

     /**
      * Element accessor
      */
     public E getData() 
     {
       return this.data;
     }

     /**
      * Element mutator
      */
     public void setData(E e)
     {
       this.data = e;
     }
  }

/////////////////////// Iterator Interface ///////////////////////////////
  public class Interator12 implements Iterator<E>
  {
    private Node<E> next;   // the Node next to be visited
    private Node<E> last;   // the Node last visited
    private Node<E> pred;   // the predecessor of last node
    private int expectedModCount = modCount; //copies the collection's mod count

    public Interator12()
    {
      this.pred = null;     // predecessor of "last" node
      this.last = null;     // last node returned
      this.next = head;     // node to return next
    }

    /**
     * Returns true if the iteration has more elements. In other words, 
     * returns true if next() would return an element rather than 
     * throwing an exception.
     * @return true if the iteration has more elements
     */
    public boolean hasNext()
    {
      if(this.next() != null)
      {
        return true;
      }
      return false;
    }

    /**
     * Returns the next element in the iteration
     * @return the next element in the iteration
     */
    public E next()
    {
      E data = null;
      if(next.getSuccessor() == null)
        throw new NoSuchElementException();
      if( expectedModCount != modCount)
        throw new ConcurrentModificationException();
      if(this.hasNext() == true)
      {
        this.pred = last;
        this.last = next;
        this.next = next.getSuccessor();
        data = next.getData();
      }
      return data;
    }
 
    /**
     * Removes from the underlying collection the last element returned by
     * this iterator. This method can be called only once per call to next().
     */
    public void remove()
    {
      if(last == null) // Prevents the user from calling remove twice in a row
      {
        throw new IllegalStateException();
      }
      if( expectedModCount != modCount)
      {
        throw new ConcurrentModificationException();
      }
      if(pred != null) // Sets the pred's next to last's next; eliminates last
      {
        pred.setSuccessor(last.getSuccessor());
      }
      else
      {
        pred.setSuccessor(last.getSuccessor());
      }
    }
  }
}
