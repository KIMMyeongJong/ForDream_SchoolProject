import java.util.*;		//Ŭ���� ���� ���
public class Dama_SecondMenu {
	public static boolean door = true;
	
	public void secondMenu() {
		door = true;			//door �ʱ�ȭ�� while�� ���������
		/***************************************************************
		 * Dama_Speacial speacial - Dama_Speacial���� ���� ���ܿ��� ���� ���
		 * Dama_Eat eat - 1���޴� ���ֱ� Ŭ���� ����		  - eat
		 * Dama_Excersise excersise - 2�� � Ŭ���� ���� -excersise
		 * Dama_Clean clean - 3�� û�� Ŭ���� ����	 	  -clean
		 * Dama_FirstMenu first - ��ȭ Ŭ���� ����		  -first
		 * Scanner scan - ��ĳ�� Ŭ���� ���
		 * 
		 ****************************************************************/	
		while(door) {			//���ֱ� �� �޴� 4������ ������ �ݺ�
		Dama_Speacial speacial 		= new Dama_Speacial();	
		Dama_Eat eat 				= new Dama_Eat();		
		Dama_Excersise excersise 	= new Dama_Excersise();
		Dama_Clean clean 			= new Dama_Clean();			
		Dama_FirstMenu first 		= new Dama_FirstMenu();	
		Dama_Status status			= new Dama_Status();
		Scanner scan 				= new Scanner(System.in);			//��ĳ�� Ŭ���� ����
		int scanGet = 0;										//scanGet - ����ġ �Է� ����
		status.status();
		System.out.println("1. ���ֱ� | 2. � | 3. û�� | 4. Ư���޴�");	//�޴� �����ֱ�
		scanGet=Integer.parseInt(scan.next());					//�Է� ���� ���� int�� ��ȯ
		//------------------------------------------------------------------------------------------------------------------------------
		switch(scanGet) {						//switch ����
			case 1 : 
				eat.eatFood();					//���ֱ� Ŭ���� �ֱ�
				 Dama_Eat.oneEat = Dama_Eat.oneEat + 1;
				break;
			case 2 : 
				excersise.input();				//� Ŭ���� �ֱ�
				break;
			case 3 :
				clean.clean();					//û�� Ŭ���� �ֱ�
				break;
			case 4 :  								//Ư���޴�
				while(Dama_Speacial.end < 900){ 	//4�� ���� 4�� ������ ��������(�������� ���)
					speacial.speacial_Menu(); 	//����� �޴� Ŭ������ �̵�
				}//while ����
				Dama_Speacial.end = 0;
			}//end switch
		
		}//end while
	}//end secondMenu
}//end Dama_SecondMenu
