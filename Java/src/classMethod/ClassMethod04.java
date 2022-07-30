package classMethod;
import classMethod.human.Human04;

public class ClassMethod04 {
public static void main(String[] args) {
	// Human04インスタンスを生成すると、コンストラクタ内の処理が実行される
	Human04 yamada = new Human04("山田");
	Human04 sato = new Human04("佐藤");
	Human04 yamamoto = new Human04("山本");
	Human04.staticMethodPrint();
	System.out.println(Human04.GREETHING);
	 // インスタンスメンバーは直接使用できない（コンパイルエラーになる）
    // Human04.instanceMethodPrint();
    // System.out.println(Human04.name);

    // インスタンスメンバーはインスタンス生成してから使用する
	yamada.instanceMethodPrint();
	sato.instanceMethodPrint();
	yamamoto.instanceMethodPrint();
}
}
