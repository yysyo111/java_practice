
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
	public static void main(String[] args) {
		// HashMapを生成する場合
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// 要素を追加する
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		
		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		
		System.out.println(map1.containsKey(0));
		// 値の存在チェック (falseを返す)
		map1.containsValue("ぶどう");
		
		System.out.println(map1.size()); // 2を返す
		
//		map1.remove(3, "もも");
		
		System.out.println(map1.size()); // 1を返す
		// TreeMapを生成する場合
		
		// キーのみ
		for (Integer key : map1.keySet()) {
		  System.out.println(key); 
		}
		
		// 値のみ
		for (String name : map1.values()) {
		  System.out.println(name);
		}
		
		// キーと値のペア
		for (Map.Entry<Integer, String> map : map1.entrySet()) {
		  System.out.println(map.getKey() + "番は" + map.getValue() + "です"); 
		}
		
		Map<String, String> map2 = new TreeMap<String, String>();
	}
}

