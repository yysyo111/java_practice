import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		
		Collections.sort(
		    numbers,
//		    ラムダ式
		    (Integer x, Integer y) -> {
		        return Integer.compare(x, y);
		    });
//		    new Comparator<Integer>() {
//		    	@Override
//		    	public int compare(Integer x, Integer y) {
//		    		return Integer.compare(x,y);
//		    	}
//		    });
		System.out.println(numbers);
	}
}

//Comparator が関数型インターフェース
//ラムダ式  (引数) -> {処理}
//(Integer x, Integer y) -> {
//	  return Integer.compare(x, y);
//	};