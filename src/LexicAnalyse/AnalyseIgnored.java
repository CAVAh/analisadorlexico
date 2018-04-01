package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseIgnored extends AnalyseContract {

	public boolean analyse(String lexeme) {
		boolean found = true;

		if (lexeme.matches("//.*$")) {
			this.tokenName = "comment";
		} else if (lexeme.matches("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)")) {
			this.tokenName = "comment";
		} else {
			found = false;
		}

		return found;
	}
}
