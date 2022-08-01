package practice;

public class Chapter15_3 {
    public static void main(String[] args) {
        int i1 = 123;
        double d1 = i1;
        System.out.println(d1);

        double d2 = 12.345;
//      int i2 = d2;
        int i2 = (int) d2;
        System.out.println(i2);

        int i3 = 1;
        int i4 = 2;
        double d3 = i3 / i4;
        System.out.println(d3);

        int i5 = 128;
//        byte b1 = i5;
        byte b1 = (byte)i5;
        System.out.println(b1);
}
}

//プリミティブ型のキャスト「変数名 = (型) 元の変数名」で変換
//データサイズが小さい型から大きい型は暗黙的にキャストされるため、明示的にキャストする必要がない