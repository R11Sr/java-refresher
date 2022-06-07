
/**
 * Write a description of class Tile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tile
{
    // instance variables - replace the example below with your own
    private char letter;
    private int value;

    /**
     * Constructor for objects of class Tile
     */
    public Tile()
    {

    }
    
    public Tile( char letter, int value)
    {
        this.letter = letter;
        this.value = value;
    }
    
    public static void printTile(Tile tile){
        System.out.printf("Letter: %c, value: %d",tile.letter,tile.value);
        
    }
    
    public static void testTile(){
        Tile tile = new Tile('Z',10);
        printTile(tile);
    }
    
    public String toString(){
        return String.format("<Tile - Letter: %c Value: %d>",this.letter, this.value);
    }
    
    public boolean equals(Tile that){
    
        return this.letter == that.letter && this.value == that.value;
    }
    
    public char getLetter(){
        return this.letter;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setLetter(char assign){
        this.letter = assign;
    }
    
    public void  setValue(){
        this.value  = value;
    }
    
    
}


