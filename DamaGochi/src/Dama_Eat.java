import java.util.*;

public class Dama_Eat {
	public static int oneEat = 0;
	public static int ddong = 0;

	public void eatFood() {
		Dama_Ddong dut = new Dama_Ddong();

		int DamaFood = 0;

		String[] Food = { "������", "������", "ġŲ", "����", "�����", "��������", "�Ұ��", "����", "����ġ��" };

		System.out.println("(���� 2�������� '��' �Ѱ��� �����˴ϴ�.'��'�� 2�����Ǹ� ����մϴ�.)");
		System.out.println("�鳪�� ���� ���� ��");
		System.out.println("-------------");

		Random rand = new Random();
		String Foodrand = Food[rand.nextInt(9)];
		int FeelRand =  rand.nextInt(9) *5+10;
		Dama_Status.feel = Dama_Status.feel + DamaFood;
		Dama_Status.feel = Dama_Status.feel + FeelRand;
		if (Foodrand == "����ġ��") {
			Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
			ddong = 0;
			oneEat = 0;
		}
		System.out.println(Foodrand + "�� �Ծ����ϴ�");
		
		if (oneEat % 2 == 0) {
			dut.Ddong();
		}
		System.out.println("-------------");

		if (Dama_Status.feel >= 100) {
			System.out.println("��ĳ���Ͱ� �谡���� �׾����ϴ�.��");
			Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
		} // end if
		
		
		else if (Dama_Status.feel <= 100&&Dama_SecondMenu.door == true) {
			System.out.println("");
			System.out.println("�������� " +FeelRand + "�ö����ϴ�.");
			System.out.println("-------------");
			Dama_Status.exp = Dama_Status.exp + 20;
			System.out.println("����ġ 20 ȹ��");
			System.out.println("-------------");

		} // end else if

	}// end eatFood
}// end Dama_Eat
