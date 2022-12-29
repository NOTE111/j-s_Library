package Person;
public class PersonTest{
    public static void main(String[] args) {

        Person jaehwan = new Person(180,70,5_000_000_000L, "allornothing", true);
        jaehwan.hasHair();
        jaehwan.hasHair(200_000);
        System.out.println("jaehwan은 키가 " + jaehwan.height + "이고 몸무게는 " + jaehwan.kg + "이다. 자산은 " + jaehwan.asset + " 정도 있으며 좋아하는 것과 싫어하는 것은 " + jaehwan.likes_Dislikes + "이다. 마지막으로 jaehwan은 비건ㅅ " + jaehwan.vegan + " 이다." );
    }
}

class Person{
   int height;
    int kg;
    long asset;
    String likes_Dislikes;
    boolean vegan;

    public Person(int height, int kg, long asset, String likes_Dislikes, boolean vegan) {
        this.height = height;
        this.kg = kg;
        this.asset = asset;
        this.likes_Dislikes = likes_Dislikes;
        this.vegan = vegan;
        System.out.println("jaehwan is cool!");
    }


    void hasHair(){
        System.out.println(height);
    }
    void hasHair(int pick) {
        System.out.println(pick + " 개의 모발이 있네요.");
    }

}
