package domain;

/**
 *    class description
 *
 *    @author AnHyungJu, ParkDooWon
 */
public enum Symbol {
	ACE("A", 11),
	TWO("2", 2),
	THREE("3", 3),
	FOUR("4", 4),
	FIVE("5", 5),
	SIX("6", 6),
	SEVEN("7", 7),
	EIGHT("8", 8),
	NINE("9", 9),
	TEN("10", 10),
	JACK("J", 10),
	QUEEN("Q", 10),
	KING("K", 10);

	private static final int BUST_SCORE = 21;

	private String symbol;
	private int score;

	Symbol(String symbol, int score) {
		this.symbol = symbol;
		this.score = score;
	}

	public static boolean isBust(int score) {
		return score > BUST_SCORE;
	}

	public String getSymbol() {
		return symbol;
	}

	public int getScore() {
		return score;
	}
}
