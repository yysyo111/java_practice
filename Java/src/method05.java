
public class method05 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}
}

//public static 戻り値の型 メソッド名(引数リスト) {
//	メソッドが実行されたときに動く処理
//	return 戻り値
//}
//void は何もないという意味を指す

//メソッドを呼び出し、戻り値を受け取る
//型 変数名 = メソッド名(引数リスト); メソッドが呼び出されてreturnで返される