import java.util.*; //Ŭ���� ���� ���

public class Dama_Main {

	public static void main(String[] args) { // ����Ŭ����
		/*****************************************************
		 * Dama_FirstMenu first - ù��° �޴� ������ Dama_SecondMenu second - �ι�° �޴� ������
		 * Dama_Speacial speacial - ����� �޴� ������
		 ******************************************************/
		Dama_Timer time = new Dama_Timer();

		time.run();
		while (true) {
			Dama_FirstMenu first = new Dama_FirstMenu();
			Dama_SecondMenu second = new Dama_SecondMenu();
			Dama_Speacial speacial = new Dama_Speacial();

			while (Dama_Speacial.run == true) { // ������ run���� false�� �ٲ㼭 while�� Ż��
				first.firstMenu1(); // ù��° �޴� ����
				second.secondMenu(); // �ι�° �޴� ����
			}

			Dama_Speacial.run = true; // run������ �ٽ� true�� �ٲ���
			Dama_Speacial.end = 0; // end�� �ʱ�ȭ�� Ư���޴� �����Ӱ� ��� ����
			Dama_Status.finalLev = 0;
			Dama_Status.exp = 0;
			Dama_Status.strong = 0;
			Dama_Status.feel = 0;
			Dama_Eat.ddong = 0;
			Dama_Status.j = 0;
			continue; // ó������ ���ư� �ٽ� ��ȭ��Ŵ
		} // end while
	}
}
