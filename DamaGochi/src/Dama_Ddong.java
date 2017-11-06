import java.util.*;
public class Dama_Ddong {
		      public void Ddong() {

		      if (Dama_Eat.oneEat>=2) {
		         System.out.println("똥 생성");
		         Dama_Eat.ddong = Dama_Eat.ddong+1;
		      }
		      if (Dama_Eat.ddong==3) {
		         System.out.println("위생이 불량해서 사망했습니다.");
		         Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
		      }
		   }
		}

