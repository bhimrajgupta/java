package BasicPrograms;

public class Capitalise_first_character_each_word {

	public static void main(String[] args) {

		String question = "this is what i was asked to convert";
		StringBuilder answer = new StringBuilder(question.length());
		String words[] = question.split("\\ ");

		for (int i = 0; i < words.length; i++) {
			answer.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}

		System.out.println(answer);
	}
}
