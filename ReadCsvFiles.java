package Beginning;

import java.util.List;
import java.util.Iterator;
import java.io.FileReader;
import au.com.bytecode.opencsv.CSVReader;



public class ReadCsvFiles {
	
	public static void main(String[] args) throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\pranaya\\Desktop\\csc.csv"));
		List<String[]> li=reader.readAll();
		System.out.println("Total rows " +li.size());
		Iterator<String[]>i1= li.iterator();
		while(i1.hasNext())
		{
			String[] str=i1.next();
			System.out.println("values are");
			
			for(int i=0;i<str.length;i++)
			{
				System.out.println(" " +str[i]);
			}
			
			System.out.println(" ");
		}
	}

}
