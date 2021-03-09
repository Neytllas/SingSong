package krok;

public class Player extends Apparatus
{
    @Override
    public boolean check(Drive dr)
    {
        return dr instanceof Flash;
    }

    @Override
    public String getName()
    {
        return "плеер";
    }
}
