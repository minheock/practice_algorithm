package practice_al.prac;

public class Al12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int result = solution(2, 5, true);
	System.out.println(result);
	}
	/*
	 * 문제 설명 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, 
	 * flag가 true면 a + b를 false면 a - b를 
	 * return 하는 solution 함수를 작성해 주세요.
	 */
	
	public static int solution(int a, int b, boolean flag) {
        int sum = 0;
       if(flag){
           sum = a + b;
       }else{
           sum = a - b;
       }
        return sum;
    }
}
