import java.util.ArrayList;
import java.util.List;


public class ReverseList {
	/*public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(30);
		array.add(13);
		array.add(55);
	
		
		System.out.println(reverseList(array));
		System.out.print(array);


	}*/
	public <T> List<T> reverseList(List<T> list) {
		ArrayList<T> reverseArray = new ArrayList<T>(list.size());
		
		for(int i = list.size()-1; i>= 0; i--){
			reverseArray.add( list.get(i));
			
		}	

		return (List<T>) reverseArray;
		
	}

}
