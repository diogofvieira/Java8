package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Lorem");
		palavras.add("Ipsum");
		palavras.add("XVI");
		
		
		//Sort default method de List, metodo concreto em interface
		//Lambda
		palavras.sort((s1, s2) -> {
			if(s1.length() < s2.length())
				return -1;
			if(s1.length() > s2.length())
				return 1;
			return 0;
		});
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(palavras);
		
		//foeach default method de Iterable, metodo concreto em interface
		//Lambda ->
		palavras.forEach(t -> System.out.println(t));
		
		
		//Method Reference ::
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);
		
	}

}


class ComparadorTamanho implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()){
			return -1;
		}if(o1.length() > o2.length()){
			return 1;
		}
		return 0;
	}
	
}