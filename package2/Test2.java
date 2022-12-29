package package2; //package2

import package1.Parent;

import java.util.SplittableRandom;


class Child extends package1.Parent { //package1에서 Parent클래스를 상속
    public void printEach() {
        //System.out.println(a); private 에러 발생!! 동일클래스가 아니기에
        //System.out.println(b); default 에러 발생!! 동일패키지가 아니기에
        System.out.println(c); //protected 다른 패키지의 하위 클래스이니 사용허용
        System.out.println(d); // public이니 무조건 허용
    }
}

public class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();

       // System.out.println(p.a); public을 제외한 모든 호출 에러 왜 why?
       // System.out.println(p.b); Parent와 다른 클래스이고 package1과 다르며
       // System.out.println(p.c); 심지어 본 Test2는 Parent의 하위클래스도 아니므로
        System.out.println(p.d);
    }
}
