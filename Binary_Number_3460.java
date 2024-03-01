/*
    백준 3460번 문제 : 이진수

    날짜 : 2024-03-01

    [설명]
    양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.


    [입력]
    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)


    [출력]
    각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.


    [ 풀이 시간 ]
    총 풀이시간 2035 ~ 2043
        - 문제 분석 ( 2035 ~ 2036 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 2037 ~ 2040 )
        - 코드 구현 ( 2040 ~ 2043 )

 */

import java.io.*;

public class Binary_Number_3460 {
    public static String binaryPositions(int T) {
        StringBuilder stringBuilder = new StringBuilder();
        int position  = 0;
        while ( T != 0 ) {
            if ( T % 2 == 1 ) {
                stringBuilder.append(position);
                stringBuilder.append(" ");
            }
            T = T/2;
            position++;
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        System.out.println(binaryPositions(T));
    }
}
