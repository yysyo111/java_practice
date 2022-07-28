
public class method08 {
//	int型配列を受けとり、全ての要素を表示するメソッド
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array); //配列を渡す
	}
}
