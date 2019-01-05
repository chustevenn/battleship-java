public class Ship
{
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    private int row = -1;
    private int column = -1;
    private int length;
    private int direction = -1;
    
    private String[] directionArry = {"unset", "horizontal", "vertical"};
    private String[] rowArry = {"1","2","3","4","5","6","7","8","9", "10"};
    private String [] columnArry = {"1","2","3","4","5","6","7","8","9","10"};
    
    public Ship(int length)
    {
        this.length = length;
    }
    
    public boolean isLocationSet()
    {
        if(row != -1 && column != -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isDirectionSet()
    {
        if(direction == UNSET)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void setLocation(int row, int col)
    {
        this.row = row;
        column = col;
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public int getCol()
    {
        return this.column;
    }
    
    public int getLength()
    {
        return this.length;
    }
    
    public int getDirection()
    {
        return this.direction;
    }
    
    private String locationToString()
    {
        return "(" + rowArry[this.row] + ", " + columnArry[this.column] + ")";
    }
    
    private String directionToString()
    {
        return directionArry[this.direction];
    }
    
    public String toString()
    {
        if(this.row == -1 && this.column == -1 && this.direction == -1)
        {
            return "unset direction ship of length " + this.length + " at (unset location)";
        }
        else
        {
            String directionString = directionArry[this.direction+1];
            String locationString = "(" + rowArry[this.row-1] + ", " + columnArry[this.column-1] + ")";
            return directionString + " ship of length " + this.length + " at " + locationString;
        }
    }
}
