package practice_al.prac;
public class Al11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(">","!", 41, 78);
		System.out.println(result);
		System.out.println(1<2);
	}
	
	//	">", "!", 41, 78
	  public static int solution(String ineq, String eq, int n, int m) {
	        boolean whats = true;
	        if(ineq == "<" && eq == "="){
	           whats = n <= m;
	        }else if(ineq == ">" && eq == "="){
	           whats = n >= m;
	        }else if(ineq == "<" && eq == "!"){
	           whats = n < m;
	        }else if(ineq == ">" && eq == "!"){
	           whats = n > m;
	        }
	        
	        if(whats){
	            return 1;
	        }else return 0;
	    }
}
