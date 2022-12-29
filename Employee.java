public class Employee {
    int id;
    String name;

    Address address; //Address타입의 address 참조변수인데, 밑에 클래스 정의되어있지
    //어떻게 보면 객체랑 비슷하네

    public Employee(int id, String name, Address address) {
        this.id = id; //this.가 뭐라고? 해당클래스 내에 있는 고 녀석
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }
    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Employee e = new Employee(1, "김코딩", address1);
        Employee e2 = new Employee(2, "박해커", address2);

        e.showInfo();
        e2.showInfo();

    }
}

class Address {
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
