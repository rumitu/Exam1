import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestReverseList {
	public ReverseList array;

	@Before
	public void setUp() throws Exception {
		array = new ReverseList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(6);
		arr.add(10);	
				
		assertEquals(Arrays.asList(10, 6, 2, 4), array.reverseList(arr));
		
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Python");
		arr1.add("C++");	
		arr1.add("Assembler");
				
		assertEquals(Arrays.asList("Assembler", "C++", "Python", "Java"), array.reverseList(arr1));
		 	   
	    LinkedList<Integer> list = new LinkedList<Integer>();  

	    list.add(-28);  
	    list.add(20);  
	    list.add(-12);  
	    list.add(8);
	    assertEquals(Arrays.asList(8, -12, 20, -28), array.reverseList(list));
	    
	    
	    Vector<Integer> vector = new Vector<Integer>();
	    
	    vector.addElement(new Integer(3));
	    vector.addElement(new Integer(44));
	    vector.addElement(new Integer(15));
	    vector.addElement(new Integer(61));
	    
	    assertEquals(Arrays.asList(61, 15, 44, 3), array.reverseList(vector));


	    
	    
	}

}
