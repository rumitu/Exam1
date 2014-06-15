
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class SortList {

	/**
	 * @param <T>
	 * @param args
	 */


	public <T> List<T> sortList(List<T> list) {
		ArrayList<T> array = new ArrayList<T>(list);
		TreeSet<T> ts=new TreeSet<T>();
		ts.addAll(array);
		array.clear();
		array.addAll(ts);
	    return array;
		
		
		
		

	}

}
