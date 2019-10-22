package HomeWork2;

import java.io.*;
import java.util.*;


class ClassWork2 {
	public static void main(String[] args) throws Exception {
		FilesReader fr = new FilesReader(new FileReader("function.txt"));
		
		String line;
		
		List<String> list = new ArrayList<String>();
		
		while ((line = fr.readLine()) != null) {
			list.add(line);
		}
		
		System.out.println("Min: " + list.get(0) + "\n" + "Max: " + list.get(list.size() - 1));
	}
}
