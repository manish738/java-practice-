import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> month = new ArrayList<String>();
			month.add("JAN");
			month.add("FEB");
			month.add("MAR");
			System.out.println(month);
			month.add(3,"APR");
			System.out.println("ADD INDEX:"+month);
			//month.set(0 , "MONTH:::");
			//month.remove(2);
			//System.out.println("After the removing 3rd position:"+month);
			//month.remove("JAN");
			System.out.println("size of list:"+month.size());
			//month.clear();
			System.out.println(month);
			Collections.sort(month);
			System.out.println("Ascending order:"+month);
			Collections.sort(month,Collections.reverseOrder());
			//System.out.println("Decending order:"+month);
			
			List<String> mon=new ArrayList<String>();
			System.out.println(mon);
			mon.addAll(month);
			System.out.println(mon);
			mon.addAll(2,month);
			System.out.println(mon);
			Collections.swap(mon, 2, 3);
			System.out.println(mon);

			/*System.out.println("SET METHOD:"+month);
			System.out.println(month.contains("APR"));
			System.out.println(month.get(2));
			System.out.println("Position:"+month.indexOf("FEB"));
			
			
			
			
			Iterator it = month.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
		
			}*/
					
			List<String> syncal =
					Collections.synchronizedList(new ArrayList<String>());
					syncal.add("Pen");
					syncal.add("NoteBook");
					syncal.add("Ink");
					System.out.println("Iterating synchronized ArrayList:");
					synchronized(syncal) 
				{
					Iterator<String> iterator = syncal.iterator();
					while (iterator.hasNext())
					System.out.println(iterator.next());
				}
	          
	
	}

}
