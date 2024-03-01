import java.io.*;
import java.util.*;

/*
    백준 10818번 문제 : 최소, 최대

    날짜 : 2024-03-01

    [설명]
    N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.


    [입력]
    첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
    둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.


    [출력]
    첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 : 2140 ~ 2145
        - 문제 분석 ( 2140 ~ 2141 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 2141 ~ 2142 )
        - 코드 구현 ( 2143 ~ 2145 )

 */
public class Min_Max_10818 {
    public static void minMaxSolution(int N, int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int index = 0;
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        minMaxSolution(N, arr);
    }
}
