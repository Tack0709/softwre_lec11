// DayTester クラスを書く
import java.util.Scanner;

class DayTester{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        Day d1 = new Day();
        Day d2 = new Day(2023);
        Day d3 = new Day(2023,4);
        Day d4 = new Day(2023,4,24);
        Day d5 = new Day(d4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        d1.setDate(5);
        System.out.println(d1.getDate());
        System.out.println(d1);

        if(d4.equalTo(d5)){
            System.out.println("コピーコンストラクタで作ったものは等しい");
        }
        else{
            System.out.println("コピーコンストラクタで作ったものは等しくない");
        }
    }
}