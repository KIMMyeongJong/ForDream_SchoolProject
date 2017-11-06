import java.util.*;
public class Dama_Status {
	public static int exp = 0;		//전역함수로 경험치 저장
	public static int feel = 0;		//전역함수로 기분 저장
	public static int strong = 0;
	public static int lev = 0;		//전역함수로 레벨 저장
	public static int finalLev = 0; 	//전역함수로 보여줄 레벨 저장
	public static int j = 0;			//포문 제어 변수 | 체력바 증가
	public void status(){
		
		System.out.println("레벨 : " + finalLev + ".LV");
		System.out.println("경험치 : " + exp);
		System.out.println("포만감 : " + feel);
		System.out.println("체력 : " + strong);
		System.out.print("체력 : " );
		
		for(int i = 0; i<=j ; i++) {
			System.out.print("■");
		}
		System.out.println("");

		if(strong>100) {
			strong = 0;
			exp = exp + 30;
		}
		
	}
}
