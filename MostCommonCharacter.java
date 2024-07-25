package FullStackJava;
import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {

	public static void main(String[] args) {
		String s="Babulal";
		s=s.toLowerCase();
			Map<Character, Integer> map=new HashMap<>();
			for(char ch:s.toCharArray()) {
				if(map.get(ch)==null) {
					map.put(ch, 1);
				}
				else
					map.put(ch, map.get(ch)+1);
			}
		
		map.forEach((key, value)->{
			if(value>1) {
			System.out.println(key+" count "+value);
			}
		});
	}

}
