import java.util.*;

public class Dama_Excersise {
	Dama_Status status = new Dama_Status();
	Dama_Timer time = new Dama_Timer();
	int sport = 0;
	int i = 0;
	Scanner scan = new Scanner(System.in);

	public void input() {
		System.out.println("메뉴 중 하나를 선택하시오");
		System.out.println("1.산책 " + "2.잠자기 " + "3.근력운동 " + "4.유산소운동");
		i = scan.nextInt();
		switch (i) {
		case 1:
			/* 산책 */int[] expGamble = { 5, -5, 5 };
			Random num1 = new Random();
			int i = expGamble[num1.nextInt(3)];
			sport += i;
			System.out.println("체력 :" + i);
			break;

		case 2: /* 잠자기 */
			int[] expGamble1 = { 3, -3, 3 };
			Random num2 = new Random();
			int k = expGamble1[num2.nextInt(3)];
			sport += k;
			System.out.println("체력 :" + k);
			break;

		case 3:/* 근력운동 */
			int[] expGamble2 = { 10, 10, -10, -10 };
			Random num4 = new Random();
			int i2 = expGamble2[num4.nextInt(4)];
			sport += i2;
			System.out.println("체력 :" + i2);
			break;

		case 4:/* 유산소운동 */
			int[] expGamble3 = { 15, -15 };
			Random num3 = new Random();
			int i3 = expGamble3[num3.nextInt(2)];
			sport += i3;
			System.out.println("체력 :" + "+15");
			break;
		}

		Dama_Status.j++;
		Dama_Status.feel = Dama_Status.feel - 20;
		System.out.println(" 총체력 : " + Dama_Status.strong);
		status.status();

		if (Dama_Status.feel <= -50) {
			System.out.println("※캐릭터가 굶어 죽었습니다.※");
			Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
		} // if end

	}// end input
}
