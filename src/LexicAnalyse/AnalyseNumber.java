package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseNumber extends AnalyseContract {
	public boolean analyse(String lexeme) {
		boolean found = true;
		boolean value = lexeme.matches("\\d{0,5}");

		if (value == true) {
			this.tokenName = "reserved_word";
			this.tokenValue = "int";
		} else {
			value = lexeme.matches("\\d+\\.\\d+");

			if (value == true) {
				this.tokenName = "reserved_word";
				this.tokenValue = "double";
			} else {
				found = false;
			}
		}

		return found;
	}

}
