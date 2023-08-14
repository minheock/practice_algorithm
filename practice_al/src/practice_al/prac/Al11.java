package practice_al.prac;

public class Al11 {
	/* 조건 문자열 :
	 * 두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과
	 * m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(">", "!", 41, 78);
		System.out.println(result);
		System.out.println(1 < 2);
	}

	// ">", "!", 41, 78
	public static int solution(String ineq, String eq, int n, int m) {
		boolean whats = true;
		if (ineq == "<" && eq == "=") {
			whats = n <= m;
		} else if (ineq == ">" && eq == "=") {
			whats = n >= m;
		} else if (ineq == "<" && eq == "!") {
			whats = n < m;
		} else if (ineq == ">" && eq == "!") {
			whats = n > m;
		}

		if (whats) {
			return 1;
		} else
			return 0;
	}
	
	public static int solution2(String ineq, String eq, int n, int m) {
		boolean whats = true;
		if (ineq == "<" && eq == "=") {
			whats = n <= m;
		} else if (ineq == ">" && eq == "=") {
			whats = n >= m;
		} else if (ineq == "<" && eq == "!") {
			whats = n < m;
		} else if (ineq == ">" && eq == "!") {
			whats = n > m;
		}

		if (whats) {
			return 1;
		} else
			return 0;
	}
	
	
	
}
