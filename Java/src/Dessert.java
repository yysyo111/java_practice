public enum Dessert {

  // それぞれに値段を指定する
    APPLE(100), ICE_CREAM(200), CAKE(300),;

  // 値段を保持するフィールド
    private int price;

  // コンストラクタを追加。引数はint型の値段。
    private Dessert(int price) {
        this.price = price;
    }

  // 値段を取得するメソッドを追加
    public int getPrice() {
        return price;
    }
    public static void main(String[] args) {
    	System.out.println(Dessert.APPLE.getPrice());
    	System.out.println(Dessert.ICE_CREAM.getPrice());
    	System.out.println(Dessert.CAKE.getPrice()); 	
    }
}

//列挙型を使わずに定義する
//public static final String APPLE = "りんご";
//public static final String ICE_CREAM = "アイスクリーム";
//public static final String CAKE = "ケーキ";

//クラスの場合
//public class Dessert

//列挙型の場合
//public enum Dessert