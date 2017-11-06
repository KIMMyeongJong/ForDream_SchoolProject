import java.util.*;

public class Dama_Eat {
	public static int oneEat = 0;
	public static int ddong = 0;

	public void eatFood() {
		Dama_Ddong dut = new Dama_Ddong();

		int DamaFood = 0;

		String[] Food = { "볶음밥", "돈가스", "치킨", "피자", "비빔밥", "제육볶음", "불고기", "삼겹살", "상한치즈" };

		System.out.println("(밥을 2번먹으면 '똥' 한개가 생성됩니다.'똥'이 2개가되면 사망합니다.)");
		System.out.println("↓나온 음식 음식 ↓");
		System.out.println("-------------");

		Random rand = new Random();
		String Foodrand = Food[rand.nextInt(9)];
		int FeelRand =  rand.nextInt(9) *5+10;
		Dama_Status.feel = Dama_Status.feel + DamaFood;
		Dama_Status.feel = Dama_Status.feel + FeelRand;
		if (Foodrand == "상한치즈") {
			Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
			ddong = 0;
			oneEat = 0;
		}
		System.out.println(Foodrand + "을 먹었습니다");
		
		if (oneEat % 2 == 0) {
			dut.Ddong();
		}
		System.out.println("-------------");

		if (Dama_Status.feel >= 100) {
			System.out.println("※캐릭터가 배가터져 죽었습니다.※");
			Dama_SecondMenu.door = false;
			Dama_Speacial.run = false;
		} // end if
		
		
		else if (Dama_Status.feel <= 100&&Dama_SecondMenu.door == true) {
			System.out.println("");
			System.out.println("포만감이 " +FeelRand + "올랐습니다.");
			System.out.println("-------------");
			Dama_Status.exp = Dama_Status.exp + 20;
			System.out.println("경험치 20 획득");
			System.out.println("-------------");

		} // end else if

	}// end eatFood
}// end Dama_Eat
