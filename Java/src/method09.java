
public class method09 {
//	int型配列を受けとり
//	配列内の要素全てに1を加えるメソッド
	public static void intArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		intArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	} 
}
