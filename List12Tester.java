/**
 * @author Cindy Yu (cs12shz)
 * @see java.util.list<E>
 * 
 */

import java.util.*;

/**
 * Class List12Tester
 * This class is basically a test plan that implements the Java Collections 
 * interface List<E>, and implement the test plan using the JUnit Framework. It
 * contains many tests that are used to verify that the methods being used in 
 * the list is performing correctly and have the correct parameters.
 */
public class List12Tester extends junit.framework.TestCase
{
  /**
   * The main method will run the List12Tester class as a program once there is
   * a List12<E> class to test it with. The main method will provide a GUI
   * program that will show if the List12 provided passed or failed any tests.
   */
  public static void main(String args[])
  {
    junit.swingui.TestRunner.main(new String[] {"List12Tester"});
  }

  /** Checks to see if the program adds the specified elements to the list
   * and does not add anything that was not specified. Uses the contains
   * method to check the add method to check that it is added within.
   **/
  public void testAddContains() 
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply Mutations
    theL.add("A");
    theL.add("B");
    // Verifying Mutations
    assertTrue(theL.contains("A"));
    assertTrue(theL.contains("B"));
    assertFalse(theL.contains("C"));
  }

  /** 
   * Checks to see if the program is adding the elements at the end of the list
   * and then compares it to the index to verify. Uses the get method to check
   * that the add method added the elements correctly.  
   **/
  public void testAddGet()
  {
    // Setup
    List<Integer> theL = new List12<Integer>();
    // Applying Mutations
    for(int i = 1; i<=1000; i++)
    {
      theL.add(i);
    }
    // Verifying all the Mutations
    for(int i = 0; i<1000; i++)
    {
      assertEquals(theL.get(i), new Integer(i+1));
    }
  }

  /** 
   * Checks to see if the program adds the elements and returns true 
   * or false depending on if it did or not. Uses the return values to check
   * the add method.
   **/
  public void testAddReturn()
  {
    // Setup
    List<Integer> theL = new List12<Integer>();
    // Verifying and applying the mutations
    assertTrue(theL.add(1));
    assertTrue(theL.add(2));
    assertTrue(theL.add(1));
  }

  /**
   * Checks to see if the program throws an exception when an index out of bound
   * is used. Uses a try-catch to catch the IndexOutOfBounds exception.
   **/
  public void testAddIndex()
  {
    // Setup
    List<Integer> theL = new List12<Integer>();
    try
    {
      // Apply the Mutator
      theL.add(1,15);
      theL.add(-1,40);
      fail();  // Fails the list after it has gone to the catch block
    }
    // Catches the exception
    catch(IndexOutOfBoundsException ex)
    {
      //Passes the test
    } 
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }

  /**
   * Checks to see if the program contains the specified elements after it has
   * been added to the list. Uses set to test the contain method.
   */
  public void testContainsSet()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the Mutators
    theL.add("A");
    theL.add("B");
    theL.set(0,"C");
    theL.set(1,"D");
    // Verifying the mutators
    assertFalse(theL.contains("A"));
    assertFalse(theL.contains("B"));
    //assertTrue(theL.contains("C"));
    assertTrue(theL.contains("D"));
  }

  /**
   * Checks to see if the program contains the specified elements after it has
   * been removed from the list. Uses remove method to test the contain method.
   */
  public void testContainsRemove()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the Mutators
    theL.add("A");
    theL.add("B");
    theL.add("C");
    theL.add("D");
    // Removing several elements for testing
    theL.remove(1);
    theL.remove("C");
    // Verifying the mutators
    assertTrue(theL.contains("A"));
    assertFalse(theL.contains("B"));
    assertFalse(theL.contains("C"));
    assertTrue(theL.contains("D"));
  }

  /**
   * Checks to see if the program can get the element at the position in the 
   * list. Uses the remove method to test the get method.
   */
  public void testGetRemove()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the Mutators
    theL.add("A");
    theL.add("B");
    theL.add("C");
    theL.add("D");
    theL.add(1,"E");
    theL.remove(2);
    theL.remove("D");
    // Verifying the mutators
    assertTrue(theL.get(0) == "A");
    assertFalse(theL.get(1) == "B");
    assertTrue(theL.get(1) == "E");
    assertTrue(theL.get(2) == "C");
  }

  /**
   * Checks to see if the program can get the element at the position in the
   * list. Uses the set method to test the get method.
   */
  public void testGetSet()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the Mutators
    theL.add("A");
    theL.add("B");
    theL.add("C");
    theL.add("D");
    theL.set(1, "E");
    theL.set(3, "F");
    // Verifying the mutators
    assertTrue(theL.get(0) == "A");
    assertFalse(theL.get(1) == "B");
    assertTrue(theL.get(1) == "E");
    assertTrue(theL.get(2) == "C");
    assertFalse(theL.get(3) == "E");
    assertTrue(theL.get(3) == "F");
  }

  /**
   * Checks to see if the program will fail when it tries to get an element
   * from an index that does not exist in the list. 
   */ 
  public void testGetIndex()
  {
    //Setup
    List<Integer> theL = new List12<Integer>();
    try
    {
      //Attempts to get an index that does not exist
      theL.get(1);
      fail();
    }
    // Catches the exception
    catch(IndexOutOfBoundsException ex) 
    {
      //Passes the test
    }
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }
 
  /**
   * Checks to see if the program will remove the specified element from list.
   * Checks that the boolean return from the remove method is true.
   */
  public void testRemoveIndex()
  {
    //Setup
    List<String> theL = new List12<String>();
    // Applying the mutators
    theL.add("A");
    theL.add("B");
    theL.add("C");
    theL.add("D");
    // Verifying the mutators
    assertTrue(theL.remove("A"));
    assertTrue(theL.remove("C"));
    assertTrue(theL.remove("D"));
  }
 
  /**
   * Checks to see if the program will remove an index that does not exist. 
   * It should throw an IndexOutOfBounds exception.
   */
  public void testRemoveExcept() 
  {
    // Setup
    List<Integer> theL = new List12<Integer>();
    try 
    {
      // Attempts to remove an index that does not exist
      theL.remove(0);
      fail();
    }
    // Catches the exception
    catch(IndexOutOfBoundsException ex) 
    {
      //Passes the test
    }
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }
 
  /**
   * Checks to see if the program will replace the element at an index that
   * does not exist. It should throw an IndexOutOfBounds exception.
   */
  public void testSetIndex()
  {
    // Setup
    List<Integer> theL = new List12<Integer>();
    try
    {
      // Attempts to set something to index 0
      theL.set(0, 1);
      fail();
    }
    // Catches the exception
    catch(IndexOutOfBoundsException ex) 
    {
      // Passes the test
    }
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }

  /**
   * Checks to see if the program has the correct number of elements in the
   * list. Uses the add method to test the size method.
   */
  public void testSizeAdd()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the Mutators
    theL.add("A");
    theL.add("B");
    // Verify the mutators
    assertEquals(theL.size(), 2);
    // Apply more mutators
    theL.add("C");
    theL.add(1,"D");
    // Verify that the add(index, element) is successful
    assertEquals(theL.size(), 4);
  }

  /**
   * Checks to see if the program has the correct number of elements in the 
   * list. Uses the remove method to test the size method.
   */
  public void testSizeRemove()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the Mutators
    theL.add("A");
    theL.add("B");
    theL.add("C");
    theL.add("D");
    theL.remove(1);
    theL.remove("D");
    // Verify the mutators
    assertEquals(theL.size(), 2);
  }

  /**
   * Checks to see if the program has the correct number of elements in the
   * list. Uses the set method to test the size method.
   */
  public void testSizeSet()
  {
    // Setup
    List<String> theL = new List12<String>();
    // Apply the mutators
    theL.add("A");
    theL.add("B");
    theL.add("C");
    theL.add("D");
    assertEquals(theL.set(1,"E"), new String("B"));
    assertEquals(theL.set(3,"F"), new String("D"));
    // Verify the mutators
    assertEquals(theL.size(), 4);
  }

  /**
   * Checks to see if the iterator's remove method will throw an exception
   * when the next method has not been called yet. 
   */
  public void testIteratorRemove()
  {
    try 
    {
      // Setup
      List<Integer> myList = new List12<Integer>();
      // Apply Mutators
      myList.add(1);
      // Setup the iterator list
      Iterator<Integer> iterL = myList.iterator();
      // Attempts to call remove
      iterL.remove();
      fail();
    }
    // Catches the IllegalState exception
    catch(IllegalStateException ex) 
    {
      //Passes the test
    }
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }

  /**
   * Checks to see if the iterator's remove method will throw an exception when
   * the remove method is called more than once after the last next method.
   */
  public void testIterRemove()
  {
    try
    {
      // Setup
      List<Integer> myList = new List12<Integer>(); 
      // Apply mutators
      myList.add(1);
      myList.add(2);
      myList.add(3);
      myList.add(4);
      // Setup the iterator list
      Iterator<Integer> iterL = myList.iterator();
      // Calls next once but remove twice
      iterL.next();
      iterL.remove();
      iterL.remove();
      fail();
    }
    // Catches the IllegalState exception
    catch(IllegalStateException ex) 
    {
      //Passes the test
    }
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }

  /**
   * Checks to see if the iterator's remove method will throw an exception when
   * it turns a list into an empty list.
   */
  public void testIterateRemove()
  {
    try
    {
      // Setup
      List<Integer> myList= new List12<Integer>();
      // Apply Mutators
      myList.add(1);
      myList.add(2);
      myList.add(3);
      myList.add(4); 
      // Setup the iterator list
      Iterator<Integer> iterL = myList.iterator();
      // Loops through the list and removes all the elements
      while(iterL.hasNext())
      {
        iterL.next();
        iterL.remove();
      }
    }
    // Catches any unexpected exceptions
    catch(IllegalStateException ex)
    {
      fail(); //Should not reach here
    }
    catch(Throwable ex)
    {
      fail(); //Should not reach here
    } 
  }

  /**
   * Checks to see if the iterator's hasNext method will return true if the
   * iteration has more elements.
   */
  public void testIterHasNext()
  {
    // Setup 
    List<String> myList = new List12<String>();
    Iterator<String> iterL = myList.iterator();
    // Verifying that this is an empty list
    assertFalse(iterL.hasNext());
    // Apply mutators
    myList.add("A");
    myList.add("B");
    // Update iterator list
    iterL = myList.iterator();
    // Verify list
    assertTrue(iterL.hasNext());
    iterL.next();
    assertTrue(iterL.hasNext());
    iterL.next();
    assertFalse(iterL.hasNext());
  }

  /**
   * Checks to see if the iterator's next method will return an exception
   * when it is called on an empty list.
   */
  public void testIterNextException()
  {
    try
    {
      // Setup
      List<String> myList = new List12<String>();
      myList.add("A");
      Iterator<String> iterL = myList.iterator();
      // Calls next on an empty list
      iterL.next();
      iterL.next();
      fail();
    }
    // Catches the NoSuchElement exception
    catch(NoSuchElementException ex)
    {
      //Passes the test
    }
    // Catches any unexpected exceptions
    catch(Throwable ex)
    {
      fail();
    }
  }
  
  /**
   * Checks to see if the iterator's next method will return the next element
   * in the iteration.
   */
  public void testIterNext()
  {
    // Setup
    List<String> myList = new List12<String>();
    // Apply mutators
    myList.add("A");
    myList.add("B");
    myList.add("C");
    // Setup the iterator list
    Iterator<String> iterL = myList.iterator();
    // Verify that the next method returns elements that equal the inputted ones
    assertEquals(iterL.next(), "A");
    assertEquals(iterL.next(), "B");
    assertEquals(iterL.next(), "C");
  }
}
