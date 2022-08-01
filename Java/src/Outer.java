
public class Outer {
	// 外部クラスに定義したフィールドgreeting
	private String greeting = "こんにちは";
	
	
	public class Inner {
		public String hello() {
			// 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
			return greeting;
		}
	}
}

//private なフィールドも内側からであれば参照可能

//非staticなフィールドgreeting
//private String greeting = "こんにちは";
//
// staticな内部クラスInner
//public static class Inner {
//
//    public String hello() {
//   外部クラスOuterのフィールドgreetingは非staticなので、コンパイルエラー
//        return greeting;
//    }
//}

// staticなフィールドgreeting
//private static String greeting = "こんにちは";
//
//// staticな内部クラスInner
//public static class Inner {
//
//    public String hello() {
//  // 外部クラスOuterのフィールドgreetingはstaticなので、参照可能
//        return greeting;
//    }
//}