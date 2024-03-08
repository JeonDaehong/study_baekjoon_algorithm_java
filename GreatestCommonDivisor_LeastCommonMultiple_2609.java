import java.util.Scanner;

/*
    백준 2609번 문제 : 최대공약수와 최소공배수

    날짜 : 2024-03-08

    [설명]
    두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.


    [입력]
    첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.


    [출력]
    첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 : 1759 ~ 1805
        - 문제 분석 ( 1759 ~ 1800 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 1801 ~ 1802 )
        - 코드 구현 ( 1803 ~ 1805 )

 */
public class GreatestCommonDivisor_LeastCommonMultiple_2609 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return a * b / (gcd(a, b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
