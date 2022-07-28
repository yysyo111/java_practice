
public class method01 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello() {
		System.out.println("湊さん、こんにちは！");
	}
}

//メソッドの定義
//public static 戻り値の型 メソッド名(引数リスト) {
//	メソッドが呼び出された時に実行される具体的な処理 メソッドブロック
//}

//メソッドの呼び出し
//メソッド名(引数リスト)