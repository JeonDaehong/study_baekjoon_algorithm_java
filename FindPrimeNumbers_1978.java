import java.util.Scanner;

/*
    백준 1978번 문제 : 소수 찾기

    날짜 : 2024-03-13

    [설명]
    주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.


    [입력]
    첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.


    [출력]
    주어진 수들 중 소수의 개수를 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 : 2205 ~ 2210
        - 문제 분석 ( 2205 ~ 2205 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 2205 ~ 2207 )
        - 코드 구현 ( 2207 ~ 2210 )

 */
public class FindPrimeNumbers_1978 {

    private static boolean checkedPrimeNumber(int num) {
        if ( num <= 1 ) return false;
        for ( int i=2; i<num; i++) {
            if ( num % i == 0 ) return false;
        }
        return true;
    }

    private static int findPrimeNumber(int[] arr) {
        int count = 0;
        for ( int x : arr ) {
            if ( checkedPrimeNumber(x) ) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for ( int i=0; i<N; i++ ) {
            arr[i] = scan.nextInt();
        }
        System.out.println(findPrimeNumber(arr));
    }

}
