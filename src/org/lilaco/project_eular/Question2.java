package org.lilaco.project_eular;

import java.util.ArrayList;

/*
 * Question 2
 * 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다.
 * 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
 * */
public class Question2 {

    public int Answer002() {
        int answer = 0;
        ArrayList<Integer> seq = new ArrayList<Integer>();

        //1과 2로 시작하는 경우는 변수에 값을 저장하고 시작.
        seq.add(1);
        seq.add(2);

        //반복문을 사용하여 변수의 값이 4000000 이하이면 멈추기??
        //100까지 반복하는것은 임의로 정한 숫자인데 어떻게 처리해야할까?
        for(int i = 0; i < 100; i++) {
            if(i >= 2){
                seq.add(seq.get(i-2) + seq.get(i-1));
            }
            if(seq.get(i) > 4000000){
                break;
            }
        }

        //짝수 값을 갖는 모든 피보나치 항을 더하기.
        for(int i = 0; i < seq.size(); i++){
            if(seq.get(i) % 2 == 0){
                answer += seq.get(i);
            }
        }
        System.out.println(answer);

        return 0;
    }
}
