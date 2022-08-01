package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    private int minutes;

    public FlyingPhone(int minutes) {
        this.minutes = minutes;
    }
    
 // Phoneインターフェースのメソッドをオーバーライド
    public void call(String number) {
        System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
    }

 // Flyingインターフェースのメソッドをオーバーライド
    public void fly() {
        System.out.println(minutes + " 分間、飛びます。 ");
    }

    public void powerOff() {
        Flying.super.powerOff();
    }
}