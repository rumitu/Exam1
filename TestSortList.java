import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestSortList {
	public SortList array;
	@Before
	public void setUp() throws Exception {
		array = new SortList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(10);	
				
		assertEquals(Arrays.asList(2, 4, 10), array.sortList(arr));
		
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(20);
		arr1.add(200);
		arr1.add(120);	
		arr1.add(238);
		arr1.add(190);
				
		assertEquals(Arrays.asList(20, 120, 190, 200, 238), array.sortList(arr1));
		
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(-1);
		arr2.add(32);
		arr2.add(0);	
		arr2.add(23);
		arr2.add(-5);
		arr2.add(13);
		arr2.add(-9);
				
		assertEquals(Arrays.asList(-9, -5, -1, 0, 13, 23, 32), array.sortList(arr2));
		
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("Java");
		arr3.add("Python");
		arr3.add("C++");
		
	
		assertEquals(Arrays.asList("C++", "Java", "Python"), array.sortList(arr3));

	}

}
