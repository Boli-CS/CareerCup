package microsoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AppMain {
	public static void main(String[] args){
		AppMain appMain = new AppMain();
		appMain.FirstNonRepeatedCharacter("bcba");
	}
	
	/*
	 * Find the first non repeating character in a given string.
	 * You may assume that the string contains any character from any language in the world, for e.g. an Arabic
	 * or Greek character even.
	 */
	public void FirstNonRepeatedCharacter(String s){
		List<Character> candidates = new ArrayList<>();
		HashSet<Character> alreadyExisted = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(!alreadyExisted.contains(s.charAt(i))){
				if(candidates.contains(s.charAt(i))){
					Character c = new Character(s.charAt(i));
					candidates.remove(c);
					alreadyExisted.add(c);
				}
					
				else
					candidates.add(s.charAt(i));
			}
		}
		System.out.println(candidates.get(0));
	}
}
