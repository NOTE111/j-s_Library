public class VehicleTest {
    public static void main(String[] args) {
        Bike bike = new Bike(); //각각의 타입으로 선언 + 각각의 타입으로 객체생성
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();

      /*  Vehicle bike2 = new Bike(); //상위 클래스 타입으로 선언 + 각각 타입으로 객체생성
        Vehicle car2 = new Car();
        Vehicle motorBike2 = new MotorBike();

        bike2.run();
        car2.run();
        motorBike2.run();*/
        Vehicle[] vehicles = new Vehicle[] {new Bike(), new Car(), new MotorBike()};
        for (Vehicle vehicle : vehicles) {
            vehicle.run();
            //이렇게 배열로 한번에 관리가능하지 그럼 각주 처리된것처럼 일일이 객체 만들고
            //run();메소드 실행않아도 한번에 실행가능이지!
        }
    }
}


class Vehicle { //자바파일이름과 기준클래스이름이 같아야하네 또 public이 이쪽에 붙어야
    //하고
    void run() {
        System.out.println("Vehicle is runnig");
    };
}

  class Bike extends Vehicle { //Vehicle 클래스 상속
    void run() {
        System.out.println("Bike is running"); //메서드 오버라이딩
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
  }
  class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
  }
  class MotorBike extends Vehicle {
    void run() {
        System.out.println("MotorBike is runnig");
    }
  }