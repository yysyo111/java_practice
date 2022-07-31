package extend.phone;

public interface Phone {
	 int MAX_NUMBER_DIGITS = 11;

	 public void call(String number);
	 
     // defaultメソッドの宣言
     default void powerOff() {
         System.out.println("電源を切ります。");
     }
}

//[public] interface インターフェース名 extends インターフェース名, インターフェース名 {
//    // フィールドの宣言（定数）
//    (public static final) 定数の型 定数名 = 初期値;
//    // メソッドの宣言（抽象メソッド）
//    (public abstract) 戻り値の型 メソッド名(引数);
//}