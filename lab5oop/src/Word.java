public class Word extends SentenceElement implements Comparable<Word>{

	private Letter[] letters;


	public Word(String str) {
		this.letters = new Letter[str.length()];
		for (int i = 0; i < str.length(); i++) {
			this.letters[i] = new Letter(str.charAt(i));
		}
	}

	@Override
	public String toString(){
		String wordStr = "";
		for (Letter letter : letters) {
			wordStr += letter.toString();
		}
		return wordStr;
	}

	public boolean equalsString(String wordString) {
		return toString().toLowerCase().equals(wordString.toLowerCase());
	}

	public int compareTo(Word word) {
		return toString().compareToIgnoreCase(word.toString());
	}

}
