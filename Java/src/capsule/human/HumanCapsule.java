package capsule.human;

public class HumanCapsule {
	private String name;
	private int age;
	
	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
}

////getterメソッド
//public 戻り値の型(フィールドの型)  getフィールド名() {
// return this.フィールド名
//}
//
//// setterメソッド
//public void setフィールド名(フィールドの型の引数) {
// this.フィールド名 = フィールドの型の引数;
//}
