import java.util.*;
public class Dama_Status {
	public static int exp = 0;		//�����Լ��� ����ġ ����
	public static int feel = 0;		//�����Լ��� ��� ����
	public static int strong = 0;
	public static int lev = 0;		//�����Լ��� ���� ����
	public static int finalLev = 0; 	//�����Լ��� ������ ���� ����
	public static int j = 0;			//���� ���� ���� | ü�¹� ����
	public void status(){
		
		System.out.println("���� : " + finalLev + ".LV");
		System.out.println("����ġ : " + exp);
		System.out.println("������ : " + feel);
		System.out.println("ü�� : " + strong);
		System.out.print("ü�� : " );
		
		for(int i = 0; i<=j ; i++) {
			System.out.print("��");
		}
		System.out.println("");

		if(strong>100) {
			strong = 0;
			exp = exp + 30;
		}
		
	}
}
