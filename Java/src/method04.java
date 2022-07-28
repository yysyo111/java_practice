
public class method04 {
	public static void main(String[] args) {
		add(100, 20);
		add(200, 50); //実引数
	}
	public static void add(int x, int y) { //仮引数
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
