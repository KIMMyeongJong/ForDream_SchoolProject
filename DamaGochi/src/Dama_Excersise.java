import java.util.*;

public class Dama_Excersise {
	Dama_Status status = new Dama_Status();
	Dama_Timer time = new Dama_Timer();
	int sport = 0;
	int i = 0;
	Scanner scan = new Scanner(System.in);

	public void input() {
		System.out.println("�޴� �� �ϳ��� �����Ͻÿ�");
		System.out.println("1.��å " + "2.���ڱ� " + "3.�ٷ¿ " + "4.����ҿ");
		i = scan.nextInt();
		switch (i) {
		case 1:
			/* ��å */int[] expGamble = { 5, -5, 5 };
			Random num1 = new Random();
			int i = expGamble[num1.nextInt(3)];
			sport += i;
			System.out.println("ü�� :" + i);
			break;

		case 2: /* ���ڱ� */
			int[] expGamble1 = { 3, -3, 3 };
			Random num2 = new Random();
			int k = expGamble1[num2.nextInt(3)];
			sport += k;
			System.out.println("ü�� :" + k);
			break;

		case 3:/* �ٷ¿ */
			int[] expGamble2 = { 10, 10, -10, -10 };
			Random num4 = new Random();
			int i2 = expGamble2[num4.nextInt(4)];
			sport += i2;
			System.out.println("ü�� :" + i2);
			break;

		case 4:/* ����ҿ */
			int[] expGamble3 = { 15, -15 };
			Random num3 = new Random();
			int i3 = expGamble3[num3.nextInt(2)];
			sport += i3;
			System.out.println("ü�� :" + "+15");
			break;
		}

		Dama_Status.j++;
		Dama_Status.feel = Dama_Status.feel - 20;
		System.out.println(" ��ü�� : " + Dama_Status.strong);
		status.status();

		if (Dama_Status.feel <= -50) {
			System.out.println("��ĳ���Ͱ� ���� �׾����ϴ�.��");
			Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
		} // if end

	}// end input
}
