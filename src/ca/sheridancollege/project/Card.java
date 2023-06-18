/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card implements Comparable<Card>{
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */

    private final Rank rank;
    private final Suits suit;
    private final String card;


    Card(Rank rank, Suits suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException();
        }
        this.rank = rank;
        this.suit = suit;
        this.card = String.format("%s%s", rank.toString(), suit.getSymbol());
    }

    /**
     * example: CLUBS
     *
     * @return Enum name of a card objects suit
     */
    public Suits getSuit() {
        return this.suit;
    }

    /**
     * example: CLUBS = C
     *
     * @return Shorthand of an objects suit
     */
   

    /**
     * example: ACE
     *
     * @return Enum name of a card objects rank
     */
    public Rank getRank() {
        return this.rank;
    }
    @Override
    public abstract String toString();

}
