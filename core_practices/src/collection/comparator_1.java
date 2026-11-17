package collection;
import java.util.Comparator;
import java.util.TreeSet;
public class comparator_1 {
	public static void main(String[] args) 
	{
		TreeSet<Studentss> tree = new TreeSet<Stuentss>(new PageComparator());
		
		Studentss stud = new Studentss(125,654,524);
		Studentss stud1 = new Studentss(1255,6554,5274);
		Studentss stud2 = new Studentss(12255,65254,52524);
		
		set.add(stud);
		
	}

}

class Studentss implements Comparable<Studentss>
{
	int age;
	int weight;
	int height;
	
	public int compareTo(Studentss o) {
		
		return 0;
	}
	
	public int toString(Studentss o)
	{
		return 0;
	}
	
	public Studentss(int age,int weight,int height)
	{
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
}



class AgeComparator implements Comparator<Studentss>
{

	@Override
	public int compare(Studentss o1, Studentss o2) {
		
		return 0;
	}		
}

class HeightComparator implements Comparator<Studentss>
{	
	public int compare(Studentss o1, Studentss o2) {

		return 0;
	}
}

class WeightComparator implements Comparator<Studentss>
{	
	public int compare(Studentss o1, Studentss o2) {
		
		return 0;
	}
	
}
















