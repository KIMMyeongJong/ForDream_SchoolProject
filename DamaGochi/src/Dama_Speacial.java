import java.util.*;//Ŭ���� ���� ���

public class Dama_Speacial {
	public static int end = 0;
	public static int num = 0;
	public static boolean run = true;
	int empty = 0;

	public int speacial_Menu() {
		Dama_FirstMenu levelMake = new Dama_FirstMenu();
		Dama_Status stat = new Dama_Status();
		int resultEnd = 0; 											// �������� ����ġ ���� �����
		int[] expGamble = { -10, 50, -60, 100, 150, 200, -100, -9000 }; 		// int�� ������ ���� ���� ����
		Random rand = new Random(); 								// rand������ ���������� ����
		int expRand = expGamble[rand.nextInt(8)]; 					// plus�� �������� �迭���� �ϳ� ������ ��
		resultEnd = expRand + resultEnd; 								// resultEnd�� �ֵ� ������ ����ġ / expRand�� ����ġ�� �������� ������
		int insertMenu = 0; 											// insertMenu�� ����ġ ���� ����
		
		Scanner scan = new Scanner(System.in); 						// ��ĳ�� Ŭ���� ����
		
		System.out.println("�޴��� �������ּ���"); 							// �޴����� ǥ��
		System.out.println("1.����ġ ���� | 2. ���� ��� | 3. ���� Ȯ�� | 4.������"); 	// Ư���޴��� ǥ��
		
		insertMenu = Integer.parseInt(scan.next());						// insertMenu�� �޴� �� �Է¹���

		// switch ����
		switch (insertMenu) { 
		case 1:
			System.out.println("�и� Ȯ���մϴ�");

			System.out.println("");
			int result = resultEnd; // result�� resultEnd(���� ����ġ) ���� �����Ѵ�

			Dama_Status.exp = Dama_Status.exp + result; //
			
			if (Dama_Status.exp >= 200) { // ����ġ 200������ ������ �����ش�
				Dama_Status.exp = Dama_Status.exp - 200; // ����ġ���� 200�� �� ���� �ٽ� ����ġ�� ������ش�
				Dama_Status.finalLev = Dama_Status.finalLev + 1; // ������ �ϳ� �����ش�
				System.out.println("����ġ " + expRand + "ȹ��");
				System.out.println("������! | ���� ������ " + Dama_Status.finalLev + "�Դϴ�");
				break;
			} // end if(������)

			if (expRand == -9000) { // ����ġ 0 ���ϸ� ��� - ���߿� or�����ڷ� ����
				end = end + 10000;
				
				System.out.println("�ѱ����ڹ����������� - �������� 1336"); // ��� ���� ���
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("�ٽ� ������ �ֽʽÿ�.");
				System.out.println("-------------------------------------");
				System.out.println("");
				
				Dama_Status.exp = 0;
				run = false;
				Dama_SecondMenu.door = false;
				break;
			} // end if

			else if (Dama_Status.exp < 0 && Dama_Status.finalLev == 0) { // ����ġ 0 ���ϸ� ��� - ���߿� or�����ڷ� ����
				end = end + 10000;
				System.out.println("���� ġ�� �ɷȽ��ϴ�"); // ��� ���� ���
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("�ٽ� ������ �ֽʽÿ�.");
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
				System.out.println("���� -1");

				break;
			} // end else if

			else
				System.out.println("����ġ " + expRand + " ȹ��"); // ����ġ ǥ��
				stat.status();
				System.out.println("");
			break;

		case 2:
			System.out.println("����Ȯ��");
			break;
		case 3:
			System.out.println("�������");
			break;
		case 4: // ������
			end = end + 1000;
			break;

		}// end switch
		return empty;
	} // end gamble
}// end Dama_Speacial
