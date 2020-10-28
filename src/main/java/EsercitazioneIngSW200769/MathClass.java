package EsercitazioneIngSW200769;

import java.util.ArrayList;

public class MathClass {
	private static Integer limitMax;
	
	public MathClass(Integer max) {
		this.limitMax = max;
	}
	
	public static boolean checkPrime(Integer num) {
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag;   
    }
	public static ArrayList<Integer> getList(){
		if (limitMax <= 1)
		{
			System.out.println("You need to initialize the class with a number > 1");
			return null;
		}
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for (int i = 2; i <= limitMax; i++) {
			if (!checkPrime(i))
				tmp.add(i);
				
		}
		return tmp;
	}
}
