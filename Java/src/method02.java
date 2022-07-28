
public class method02 { 
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();
	}
}

//プログラムはmainメソッドから動き始める
//メソッド定義
//public static void hello() {
//重要事項の表明
//	System.out.println("こんにちは");
//処理内容
//}