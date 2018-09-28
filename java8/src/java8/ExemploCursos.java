package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploCursos {
	
		public static void main(String[] args) {
			List<Cursos> cursos = new ArrayList<Cursos>();
			cursos.add(new Cursos("Java8", 45));
			cursos.add(new Cursos("Spring", 150));
			cursos.add(new Cursos("Html", 113));
			cursos.add(new Cursos("JS", 55));
			
			cursos.sort(Comparator.comparing(c -> c.getAlunos()));
			
			cursos.forEach( c -> System.out.println(c.getNome()));
			
			//Stream funciona com collections
			int sum = cursos.stream()
					.filter(c -> c.getAlunos() >= 100)
					.mapToInt(Cursos::getAlunos)
					.sum();
			
			System.out.println(sum);
			
			//Atraves de Collectors posso passar para uma lista
			cursos = cursos.stream()
					.filter(c -> c.getAlunos() >= 100)
					.collect(Collectors.toList());
			
			cursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
		}
		

}
