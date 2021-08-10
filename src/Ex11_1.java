import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(); 
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합 
		ArrayList cha = new ArrayList(); // 차집합 
		ArrayList hap = new ArrayList(); // 합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		

		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		Iterator it1 = list1.iterator();
		Iterator it2 = list2.iterator();
		
//		kyo
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		
		//cha
		cha.addAll(list1);
		cha.removeAll(list2);
		

		
		
		
		//hap
		hap.addAll(list1);
		hap.removeAll(list2);
		hap.addAll(list2);
		//hap
				
		System.out.println("list1="+list1); 
		System.out.println("list2="+list2); 
		System.out.println("kyo="+kyo); 
		System.out.println("cha="+cha); 
		System.out.println("hap="+hap);
		
	}
	/* RESULT
	 * list1=[1, 2, 3, 4] 
	 * list2=[3, 4, 5, 6] 
	 * kyo=[3, 4]
	 * cha=[1, 2]
	 * hap=[1, 2, 3, 4, 5, 6]
	 * */
}
