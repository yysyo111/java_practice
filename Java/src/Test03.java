import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		items.add("bag");
		
//		以下はString方ではないためコンパイルエラー
//		items.add(0);
//		items.add(true);
//		以下はコンパイルはできるがエラーでる
//		String item2 = (String)items.get(1);
//		List<String> item2 = new ArrayList<>();
	}
}

//<型パラメータ> ジェネリクス