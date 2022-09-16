public class Ex2_limit {
    private int value;
    public Ex2_limit()
    {
        value=0;
    }
    public void click()
    { int x=10;
        if(value<x)
        value=value+1;
        else
            value=x;
    }

    public void reset()
    {
        value=0;
    }
    public int getValue() {
        return value;
    }



}

