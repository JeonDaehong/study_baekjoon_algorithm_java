import java.util.Arrays;
import java.util.Scanner;

/*
    백준 2693번 문제 : N번째 큰 수

    날짜 : 2024-03-11

    [설명]
    배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
    배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.


    [입력]
    첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다.
    이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.


    [출력]
    각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 : 1220 ~ 1229
        - 문제 분석 ( 1220 ~ 1224 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 1224 ~ 1226 )
        - 코드 구현 ( 1227 ~ 1229 )

 */
public class NthLargestNumber_2693 {
    // 문제 특성상 N = 3 고정
    public static int[] findNthLargestNumber(int T, int[][] A) {
        int[] answer = new int[T];
        for ( int i=0; i<T; i++ ) {
            int[] tmp = A[i];
            Arrays.sort(tmp);
            answer[i] = tmp[7];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[][] A = new int[T][10];
        for ( int i=0; i<T; i++) {
            for ( int j=0; j<10; j++ ) {
                A[i][j] = scan.nextInt();
            }
        }
        int[] answer = findNthLargestNumber(T, A);
        for ( int x : answer ) {
            System.out.println(x);
        }
    }

}
