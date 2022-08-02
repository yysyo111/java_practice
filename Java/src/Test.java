import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();
		System.out.println(list1.size());
		list1.add("java入門講座");
		list1.add("ここまで");
		list1.add("よく頑張りましたね！");
		System.out.println(list1.size());
		
		list1.remove(1);
		System.out.println(list1.size());
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();
	}
}

