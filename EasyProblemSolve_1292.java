import java.util.Scanner;

/*
    백준 1292번 문제 : 쉽게 푸는 문제

    날짜 : 2024-03-15

    [설명]
    동호는 내년에 초등학교를 입학한다.
    그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.
    이 문제는 다음과 같다.
    1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
    하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.


    [입력]
    첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1 ≤ A ≤ B ≤ 1,000)가 주어진다. 즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.


    [출력]
    첫 줄에 구간에 속하는 숫자의 합을 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 : 1425 ~ 1438
        - 문제 분석 ( 1425 ~ 1428 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 1429 ~ 1432 )
        - 코드 구현 ( 1433 ~ 1438 )

 */
public class EasyProblemSolve_1292 {
    public static int solution(int A, int B) {
        int answer = 0;
        boolean isFlag = false;
        boolean breakFlag = false;
        int count = 1;
        int nowNumber = 1;
        while (!breakFlag) {
            for ( int i=1; i<=count; i++) {
                if ( nowNumber == A ) isFlag = true;
                if ( isFlag ) answer += count;
                if ( nowNumber == B ) {
                    breakFlag = true;
                    break;
                }
                nowNumber ++;
            }
            count ++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println(solution(A, B));
    }
}
