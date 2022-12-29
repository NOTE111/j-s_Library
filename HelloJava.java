class Persona {
    String name;
    int age;

    void learn(){
        System.out.println("공부를 합니다.");
    };
    void walk() {
        System.out.println("걷습니다.");
    };
    void eat(){
        System.out.println("밥을 먹습니다.");
    };
}
class Programmer extends  Persona { //Persona 클래스로부터 상속,extends 키워드사용
    String companyName;

    void coding() {
        System.out.println("코딩을 합니다.");
    };
}

class Dancer extends Persona {
    String groupName;

    void dancing(){
        System.out.println("춤을 춥니다.");
    };
}

class Singer extends Persona{
    String bandName;

    void singing(){
        System.out.println("노래합니다.");
    };
    void playGuitar(){
        System.out.println("기타를 칩니다.");
    };
}




public class HelloJava {
    public static void main(String[] args) {
        //Persona 객체생성
        Persona p = new Persona();
        p.name = "이코딩";
        p.age = 20;
        p.learn();
        p.eat();
        p.walk(); //메소드느 sout없이도  객체.메소드명()으로 출력가능하다 !!!
        System.out.println(p.name);

        //Programmer 객체생성
        Programmer pg = new Programmer();
        pg.name = "이해커";
        pg.age = 27;
        pg.learn(); //Persona 클래스서 상속받아 사용가능
        pg.coding(); //Programmer 클래스의 개별기능
        System.out.println(pg.name);

    }
}
