import java.util.Scanner;

/*
    백준 2581번 문제 : 소수

    날짜 : 2024-03-17

    [설명]
    자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
    예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
    이들 소수의 합은 620이고, 최솟값은 61이 된다.


    [입력]
    입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
    M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.


    [출력]
    M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
    단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 : 1943 ~ 1948
        - 문제 분석 ( 1943 ~ 1945 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 1945 ~ 1946 )
        - 코드 구현 ( 1946 ~ 1948 )

 */
public class PrimeNumber_2581 {
    private static boolean checkedPrimeNumber(int num) {
        if ( num <= 1 ) return false;
        for ( int i=2; i<num; i++) {
            if ( num % i == 0 ) return false;
        }
        return true;
    }
    public static void solution(int M, int N) {
        boolean firstCheck = true;
        int minPrimeNumber = 0;
        int sumPrimeNumber = 0;
        for ( int i=M; i<=N; i++ ) {
            if ( checkedPrimeNumber(i) ) {
                if ( firstCheck ) {
                    minPrimeNumber = i;
                    firstCheck = false;
                }
                sumPrimeNumber += i;
            }
        }
        if ( firstCheck ) {
            System.out.println(-1);
        } else {
            System.out.println(sumPrimeNumber);
            System.out.println(minPrimeNumber);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        solution(M,N);
    }
}
