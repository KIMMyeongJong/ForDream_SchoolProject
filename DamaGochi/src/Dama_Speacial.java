import java.util.*;//클래스 전부 사용

public class Dama_Speacial {
	public static int end = 0;
	public static int num = 0;
	public static boolean run = true;
	int empty = 0;

	public int speacial_Menu() {
		Dama_FirstMenu levelMake = new Dama_FirstMenu();
		Dama_Status stat = new Dama_Status();
		int resultEnd = 0; 											// 랜덤받은 경험치 최종 결과값
		int[] expGamble = { -10, 50, -60, 100, 150, 200, -100, -9000 }; 		// int로 랜덤에 사용될 변수 정렬
		Random rand = new Random(); 								// rand변수는 랜덤변수로 정의
		int expRand = expGamble[rand.nextInt(8)]; 					// plus는 랜덤으로 배열에서 하나 가져온 값
		resultEnd = expRand + resultEnd; 								// resultEnd는 최동 도출할 경험치 / expRand는 경험치를 랜덤으로 가져옴
		int insertMenu = 0; 											// insertMenu는 스위치 제어 변수
		
		Scanner scan = new Scanner(System.in); 						// 스캐너 클래스 생성
		
		System.out.println("메뉴를 선택해주세요"); 							// 메뉴선택 표시
		System.out.println("1.경험치 도박 | 2. 뱃지 사용 | 3. 뱃지 확인 | 4.나가기"); 	// 특수메뉴들 표시
		
		insertMenu = Integer.parseInt(scan.next());						// insertMenu는 메뉴 값 입력받음

		// switch 시작
		switch (insertMenu) { 
		case 1:
			System.out.println("패를 확인합니다");

			System.out.println("");
			int result = resultEnd; // result에 resultEnd(최종 경험치) 값을 대입한다

			Dama_Status.exp = Dama_Status.exp + result; //
			
			if (Dama_Status.exp >= 200) { // 경험치 200넘으면 레벨업 시켜준다
				Dama_Status.exp = Dama_Status.exp - 200; // 경험치에서 200을 뺀 값을 다시 경험치로 만들어준다
				Dama_Status.finalLev = Dama_Status.finalLev + 1; // 레벨을 하나 더해준다
				System.out.println("경험치 " + expRand + "획득");
				System.out.println("레벨업! | 현재 레벨은 " + Dama_Status.finalLev + "입니다");
				break;
			} // end if(레벨업)

			if (expRand == -9000) { // 경험치 0 이하면 사망 - 나중에 or연산자로 수정
				end = end + 10000;
				
				System.out.println("한국도박문제관리센터 - 국번없이 1336"); // 사망 문자 출력
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("다시 선택해 주십시오.");
				System.out.println("-------------------------------------");
				System.out.println("");
				
				Dama_Status.exp = 0;
				run = false;
				Dama_SecondMenu.door = false;
				break;
			} // end if

			else if (Dama_Status.exp < 0 && Dama_Status.finalLev == 0) { // 경험치 0 이하면 사망 - 나중에 or연산자로 수정
				end = end + 10000;
				System.out.println("구라 치다 걸렸습니다"); // 사망 문자 출력
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("다시 선택해 주십시오.");
				System.out.println("-------------------------------------");
				System.out.println("");
				Dama_Status.exp = 0;
				run = false;
				Dama_SecondMenu.door = false;
				break;
			} // end if

			else if (Dama_Status.finalLev > 0 && Dama_Status.exp < 0) {
				Dama_Status.exp = 200 + Dama_Status.exp;
				Dama_Status.finalLev = Dama_Status.finalLev - 1;
				System.out.println(expRand);
				System.out.println("레벨 -1");

				break;
			} // end else if

			else
				System.out.println("경험치 " + expRand + " 획득"); // 경험치 표시
				stat.status();
				System.out.println("");
			break;

		case 2:
			System.out.println("뱃지확인");
			break;
		case 3:
			System.out.println("뱃지사용");
			break;
		case 4: // 나가기
			end = end + 1000;
			break;

		}// end switch
		return empty;
	} // end gamble
}// end Dama_Speacial
