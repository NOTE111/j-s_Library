package practicepack.test2;

import practicepack.test.ExampleImp; // import문 작성
//패키지명.*하면 해당 패키지 디렉토리 내 모든 클래스 인터페이스파일들을 참조하겠다는 의미
public class PackageImp {
    public static void main(String[] args) {
        ExampleImp x = new ExampleImp();
        x.a = 22;
        System.out.println(x.a);
        x.print();
    }
}
