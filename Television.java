import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Television {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HDTV> tvList = new ArrayList<HDTV>();
		tvList.add(new HDTV("A",50));
		tvList.add(new HDTV("B",10));
		tvList.add(new HDTV("C",60));
		Collections.sort(tvList,new TelevisonComp());
		System.out.println("Sorted list entries: ");
		for(HDTV e:tvList)
		{
			System.out.println(e);
		}
		

	}

}
class HDTV
{
	String brandName;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	int size;
	HDTV()
	{
		
	}
	HDTV(String name,int size)
	{
		this.brandName=name;
		this.size=size;
	}
	public String toString()
	{
		return "Name: "+this.brandName+"-- Size: "+this.size;
	}
	
}
class TelevisonComp implements Comparator<HDTV>{

	@Override
	public int compare(HDTV t1, HDTV t2) {
		// TODO Auto-generated method stub
		if(t1.getSize()<t2.getSize())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}


