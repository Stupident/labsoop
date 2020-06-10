import java.util.ArrayList;

public class Sentence {
	private static final String punctuationSymbols = ",.!?;";
	private SentenceElement[] sentenceElements;
	private ArrayList<Word> wordsInSenList = new ArrayList<Word>();
	private int wordcount;

	public Sentence(String sentenceString) {
		String[] sentenceElementsStrings = sentenceString.split("(?=[" + punctuationSymbols + "])|\\s");
		sentenceElements = new SentenceElement[sentenceElementsStrings.length];
		String sentenceElementString;
		for (int i = 0; i < sentenceElementsStrings.length; i++) {
			sentenceElementString = sentenceElementsStrings[i];
			if (punctuationSymbols.contains(sentenceElementString)) {
				sentenceElements[i] = new Punctuation(sentenceElementString);
			}else {
				sentenceElements[i] = new Word(sentenceElementString);
				wordcount += 1;
				wordsInSenList.add(new Word(sentenceElementString));
			}

		}
	}

	public int length(){
		return wordcount;
	}

	public Word[] getWords(){
		Word[] wordsInSentence = new Word[wordcount];
		for (int index = 0; index < wordsInSenList.size(); index++) {
			wordsInSentence[index] = wordsInSenList.get(index);
		}
		return wordsInSentence;
	}

	@Override
	public String toString() {
		StringBuilder sentenceString = new StringBuilder();
		for (int i = 0; i < sentenceElements.length; i++) {
			sentenceString.append(
					(i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
							sentenceElements[i].toString()
			);
		}
		return sentenceString.toString();
	}


}