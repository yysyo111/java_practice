
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();
		
		set1.add("スイカ");
		set1.add("メロン");
		
		// 存在チェック (trueを返す)
		set1.contains("スイカ");

		// 存在チェック (falseを返す)
		set1.contains("なし");
		
		for (String set : set1) {
			System.out.println(set);
		}
		
		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
	}
}
