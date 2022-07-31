package exception;

public class Exception09 {
	public static void main(String[] args) {
		try {
			int[] num = new int[1];
			num[1] = 1;
//			num[0] = 2; エラー起きない
			System.out.println("正常に終了しました");
		} catch (Exception e) {
			System.out.println("エラーが発生しました");
//			エラー情報出力
			e.printStackTrace();
		} finally {
			System.out.println("処理が終了します");
		}
	}
}
