import java.util.*; //클래스 전부 사용

public class Dama_Main {

	public static void main(String[] args) { // 메인클래스
		/*****************************************************
		 * Dama_FirstMenu first - 첫번째 메뉴 가져옴 Dama_SecondMenu second - 두번째 메뉴 가져옴
		 * Dama_Speacial speacial - 스페셜 메뉴 가져옴
		 ******************************************************/
		Dama_Timer time = new Dama_Timer();

		time.run();
		while (true) {
			Dama_FirstMenu first = new Dama_FirstMenu();
			Dama_SecondMenu second = new Dama_SecondMenu();
			Dama_Speacial speacial = new Dama_Speacial();

			while (Dama_Speacial.run == true) { // 죽으면 run값을 false로 바꿔서 while문 탈출
				first.firstMenu1(); // 첫번째 메뉴 생성
				second.secondMenu(); // 두번째 메뉴 생성
			}

			Dama_Speacial.run = true; // run변수를 다시 true로 바꿔줌
			Dama_Speacial.end = 0; // end값 초기화로 특수메뉴 자유롭게 사용 가능
			Dama_Status.finalLev = 0;
			Dama_Status.exp = 0;
			Dama_Status.strong = 0;
			Dama_Status.feel = 0;
			Dama_Eat.ddong = 0;
			Dama_Status.j = 0;
			continue; // 처음으로 돌아가 다시 부화시킴
		} // end while
	}
}
