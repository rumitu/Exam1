import java.util.ArrayList;



public class MonotonousList {

	public  boolean isMonotoneIncreasing(ArrayList<Integer> array){
		boolean isInc = true;
		for(int i = 0; i < array.size()-2 ; i++){

				if(array.get(i+1) <= array.get(i)){
					isInc = false;
					break;
				}
			
		}
		return isInc;
		
		
	}
	public  boolean isMonotoneDecreasing(ArrayList<Integer> array){
		boolean isDec = true;
		for(int i = 0; i < array.size()-2 ; i++){

				if(array.get(i+1) >= array.get(i)){
					isDec = false;
					break;
				}
			
		}
		return isDec;
		
		
	}
	public  boolean isMonitonousList(ArrayList<Integer> array){
		
		return isMonotoneDecreasing(array) || isMonotoneIncreasing(array);
		
	}

}
