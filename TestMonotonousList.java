import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestMonotonousList {
	public MonotonousList arr;
	@Before
	public void setUp() throws Exception {
		arr = new MonotonousList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
				//Arrays.asList(1,2,3,4,5,6)
				ArrayList<Integer> array = new ArrayList<Integer>();
				array.add(1);
				array.add(2);
				array.add(3);
				array.add(4);
				array.add(5);
				array.add(6);

			

				assertTrue(arr.isMonitonousList(array));
			
				//Arrays.asList(6,5,4,3,2,1,1,1);
				ArrayList<Integer> array1 = new ArrayList<Integer>();
				array1.add(6);
				array1.add(5);
				array1.add(4);
				array1.add(3);
				array1.add(2);
				array1.add(1);
				array1.add(1);
				

				assertTrue(arr.isMonitonousList(array1));
				
				//(Arrays.asList(1,2,1,4,5,4)); //fals2
				ArrayList<Integer> array2 = new ArrayList<Integer>();
				array2.add(1);
				array2.add(2);
				array2.add(1);
				array2.add(4);
				array2.add(5);
				array2.add(4);

				assertFalse(arr.isMonitonousList(array2));
			
	}

}
