import java.util.*;
public class Dama_Ddong {
		      public void Ddong() {

		      if (Dama_Eat.oneEat>=2) {
		         System.out.println("�� ����");
		         Dama_Eat.ddong = Dama_Eat.ddong+1;
		      }
		      if (Dama_Eat.ddong==3) {
		         System.out.println("������ �ҷ��ؼ� ����߽��ϴ�.");
		         Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
		      }
		   }
		}

