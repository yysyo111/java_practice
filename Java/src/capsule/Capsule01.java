package capsule;
import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 70;
		System.out.println("名前は" + human1.name + "、年齢は" + human1.age + "です");
		
		// 名前や年齢が変更禁止のカプセル化されたインスタンスを生成
        HumanCapsule human2 = new HumanCapsule("小林", 32);
        // privateのアクセス制限のため、以下のようにsetterを使わずに直接変更しようとするとコンパイルエラーが発生する
        // human2.name = "三村";
        // 直接変更されないため、想定通りの名前と年齢が取得できる。取得は、getterメソッドを使用する
        System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
        // 変更は、setterメソッドを使用する
        human2.setName("佐々木");
        System.out.println("変更した名前は" + human2.getName() + "です。");
	}
}
