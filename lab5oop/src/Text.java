import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.HashSet;


public class Text {
	private Sentence[] sentences;

	public Text(String textString) {
		String[] sentencesStrings = textString.split("(?<=[?!.]) ");
		sentences = new Sentence[sentencesStrings.length];
		for (int i = 0; i < sentencesStrings.length; i++) {
			sentences[i] = new Sentence(sentencesStrings[i]);
		}
	}

	public int length(){
		int length = 0;
		for (Sentence sentence : sentences) {
			length += sentence.length();
		}
		return length;
	}

	@Override
	public String toString() {
		StringBuilder textString = new StringBuilder();
		for (int i = 0; i < sentences.length; i++) {
			textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : ""));
		}
		return textString.toString();
	}

	public String delCopyAndSort() {
		Word[] listWords = getWordArray();

		HashSet<Word> listOriginalWords = new HashSet<Word>();
		for (Word word : listWords) {
			boolean identity = true;
			for (Word listOriginalWord : listOriginalWords)
				if (word.equalsString(listOriginalWord.toString())) {
					identity = false;
				}
			if(identity){
				listOriginalWords.add(word);
			}
		}

		Word[] arrayOriginalWords = new Word[listOriginalWords.size()];
		listOriginalWords.toArray(arrayOriginalWords);
		System.out.println(arrayOriginalWords.length);

		Arrays.sort(arrayOriginalWords);

		String strRes = "";
		for (Word originalWord : arrayOriginalWords) {
			strRes += originalWord + " ";
		}
		return strRes;

	}

	public Word[] getWordArray(){
		Word[] listWords = new Word[length()];
		int index = 0;
		for (Sentence sentence : sentences) {
			for (Word word : sentence.getWords()){
				listWords[index] = word;
				index++;
			}
		}
		return listWords;
	}
}