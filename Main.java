import java.util.Scanner;
public class Main {
    /*우선 한국전력공사에서 주택용 저압을 일정한 키로와트 구간별로 나누어
    * 계산해주는 프로그램제작을 발주했다. 어떻게 할까?
    * 일단 */

    public static void main(String[] args) {
        System.out.println("=".repeat(25));
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("=".repeat(25));
        System.out.println("귀하세대의 전기 사용량(kWh)을 입력해주세요 :");
        Scanner scanner = new Scanner(System.in);
        double kWh = scanner.nextDouble();

        final double USAGE100 = 60.7;
        final double USAGEOVER100 = 125.9;
        final double USAGEOVER200 = 187.9;
        final double USAGEOVER300 = 280.6;
        final double USAGEOVER400 = 417.7;
        final double USAGEOVER500 = 670.6;

        double Eprice;

        if(kWh <= 0) {
            System.out.println("전력 미사용으로 확인됩니다.");
        }
        else if(kWh <= 100) {
            Eprice = kWh * USAGE100;
            System.out.printf("본 세대의 전기요금은 총 %.1f원 입니다.\n",Eprice);
        }
        else if(100 < kWh && kWh <= 200) {
            Eprice = ((kWh - 100) * USAGEOVER100) + (100 * USAGE100) ;
            System.out.printf("본 세대의 전기요금은 총 %.1f원 입니다.\n",Eprice);
        }
        else if(200 < kWh && kWh <= 300) {
            Eprice = (kWh - 200) * USAGEOVER200 + (100 * USAGE100) + (100 * USAGEOVER100);
            System.out.printf("본 세대의 전기요금은 총 %.1f원 입니다.\n",Eprice);
        }
        else if(300 < kWh && kWh <= 400) {
            Eprice = (kWh - 300) * USAGEOVER300 + (100 * USAGE100) + (100 * USAGEOVER100) + (100* USAGEOVER200);
            System.out.printf("본 세대의 전기요금은 총 %.1f원 입니다.\n",Eprice);
        }
        else if(400 < kWh && kWh <= 500) {
            Eprice = (kWh - 400) * USAGEOVER400 + (100 * USAGE100) + (100 * USAGEOVER100) + (100* USAGEOVER200) + (100 * USAGEOVER300);
            System.out.printf("본 세대의 전기요금은 총 %.1f원 입니다.\n",Eprice);
        }
        else if(500 < kWh && kWh <= 1000){
            Eprice = (kWh - 500) * USAGEOVER500 + (100 * USAGE100) + (100 * USAGEOVER100) + (100* USAGEOVER200) + (100 * USAGEOVER300) + (100 * USAGEOVER400);
            System.out.printf("본 세대의 전기요금은 총 %.1f원 입니다.\n",Eprice);
        }
        else {
            System.out.println("주택용(저압)용량을 초과했습니다. 주택용(고압) 계산탭으로 이동됩니다.");
        }



    }
}