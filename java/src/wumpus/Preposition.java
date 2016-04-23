package wumpus;

/**
 * 
 */

/**
 * @author reza
 *
 */
public class Preposition {

	/**
	 * type can be  'B' => Breeze
	 * 			    'G' => Glitter
	 * 			    'O' => OK, it is safe
	 * 			    'P' => Pit 
	 * 			    'S' => Stench
	 * 			    'V' => Visited	 
	 * 			    'W' => Wumpus	 
	 */
	private char type;
	
	private boolean negation = true;
	
	private int xPos = 0;
	private int yPos = 0;
	/**
	 * @param type
	 * @param negation
	 * @param xPos
	 * @param yPos
	 */
	public Preposition(char type, boolean negation, int xPos, int yPos) {
		super();
		this.type = type;
		this.negation = negation;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	
	
	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}




	/**
	 * @return the negation
	 */
	public boolean isNegation() {
		return negation;
	}




	/**
	 * @return the xPos
	 */
	public int getxPos() {
		return xPos;
	}




	/**
	 * @return the yPos
	 */
	public int getyPos() {
		return yPos;
	}




	/**
	 * 
	 * @param p
	 * @return
	 * This function is a helping function checking similarity of two prepositions
	 */
	public boolean isSame(Preposition p){
		if( ( p.getxPos() == xPos ) && ( p.getyPos() == yPos ) && ( p.getType() == type ) && ( p.isNegation() == negation ) )return true;
		else return false;
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 * 
	 * This function is a helping function checking negativity of a preposition
	 */
	
	public boolean isNegation(Preposition p){
		if( ( p.getxPos() == xPos ) && ( p.getyPos() == yPos ) && ( p.getType() == type ) && ( p.isNegation() != negation ) )return true;
		else return false;
	}
	
	public Preposition toggleNegation(){
		return new Preposition(type, !negation, xPos, yPos);
	}

	/**
	 * This function is a helping function to debug
	 */
	public void writePreposition(){
		System.out.print("(");
		if( !negation )System.out.print("~");
		System.out.print(type);
		System.out.print(xPos);
		System.out.print(yPos);
		System.out.print(")");
	}
}
