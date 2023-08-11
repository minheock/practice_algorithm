package practice_al.prac;
public class Al10 {
	// 홀짝에 따라 다른 값 반환하기
	// 재귀와 메서드로 풀어보기
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(12);
		System.out.println(result);
		
	}
	
	public static int solution(int n) {
        if(n < 1){
        	return 0;
        }
        if(n % 2== 0) return (n*n) +solution(n-2);
        else return n + solution(n-2);
    }
	
	// 재귀로 해결 완료! 짝수일때 n의 제곱을 함수를 호출하고 호출된 함수의 인자에 -2씩 부여하고 n 0이 됐을때 탈출조건을 만들어줌
	// 짝수가 아니라면 n과 호출된 함수의 n-2를 계속 더해주면서 n값이 1이 됐을때 탈출하게 조건을 만들어줌
}
