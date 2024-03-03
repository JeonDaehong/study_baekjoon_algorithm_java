import java.util.*;

/*
    백준 2460번 문제 : 지능형 기차 2

    날짜 : 2024-03-01

    [설명]
    최근에 개발된 지능형 기차가 1번역(출발역)부터 10번역(종착역)까지 10개의 정차역이 있는 노선에서 운행되고 있다.
    이 기차에는 타거나 내리는 사람 수를 자동으로 인식할 수 있는 장치가 있다.
    이 장치를 이용하여 출발역에서 종착역까지 가는 도중 기차 안에 사람이 가장 많을 때의 사람 수를 계산하려고 한다. 
    단, 이 기차를 이용하는 사람들은 질서 의식이 투철하여, 역에서 기차에 탈 때, 내릴 사람이 모두 내린 후에 기차에 탄다고 가정한다.
    
        내린 사람 수	탄 사람 수
        1번역(출발역)	0	32
        2번역	3	13
        3번역	28	25
        4번역	17	5
        5번역	21	20
        6번역	11	0
        7번역	12	12
        8번역	4	2
        9번역	0	8
        10번역(종착역)	21	0

    예를 들어, 위와 같은 경우를 살펴보자.
    이 경우, 기차 안에 사람이 가장 많은 때는 2번역에서 3명의 사람이 기차에서 내리고, 13명의 사람이 기차에 탔을 때로, 총 42명의 사람이 기차 안에 있다.

    이 기차는 다음 조건을 만족하면서 운행된다고 가정한다.

    기차는 역 번호 순서대로 운행한다.
    출발역에서 내린 사람 수와 종착역에서 탄 사람 수는 0이다.
    각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없다.
    기차의 정원은 최대 10,000명이고, 정원을 초과하여 타는 경우는 없다.
    10개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.


    [입력]
    각 역에서 내린 사람 수와 탄 사람 수가 빈칸을 사이에 두고 첫째 줄부터 열 번째 줄까지 역 순서대로 한 줄에 하나씩 주어진다. 


    [출력]
    첫째 줄에 최대 사람 수를 출력한다.  


    [ 풀이 시간 ]
    총 풀이시간 : 1040 ~ 1051
        - 문제 분석 ( 1040 ~ 1043 )
        - 손 코딩 ( X )
        - 슈도코드 [ 원초적 설계 -> 알고리즘 ] ( 1043 ~ 1046 )
        - 코드 구현 ( 1046 ~ 1051 )

 */



class Station {
    int out, in;
    public Station(int out, int in) {
        this.out = out;
        this.in = in;
    }
}
public class Intelligent_Train_2460 {
    public static int maxPassengerStation(List<Station> train) {
        int maxPassenger = Integer.MIN_VALUE;
        int nowPassenger = 0;
        for ( Station station : train ) {
            nowPassenger += station.in;
            nowPassenger -= station.out;
            maxPassenger = Math.max(maxPassenger, nowPassenger);
        }
        return maxPassenger;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Station> train = new ArrayList<>();
        for ( int i=0; i<10; i++ ) {
            int out = scan.nextInt();
            int in = scan.nextInt();
            train.add(new Station(out, in));
        }
        System.out.println(maxPassengerStation(train));
    }
}