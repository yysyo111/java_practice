import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D {
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");
		Collections.sort(
			animals,
			new Comparator<String>() {
				@Override
				public int compare(String x, String y) {
					return x.compareTo(y);
				}
			});
			System.out.println(animals);
	}
}
//リストの要素がアルファベット順になるようソート
//String の場合、 compare と似たメソッドとして compareTo