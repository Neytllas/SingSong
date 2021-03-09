package krok;

public class CDplayer extends Apparatus
{
    @Override
    public boolean check(Drive dr)
    {
        return dr instanceof Drive;
    }

    @Override
    public String getName()
    {
        return "универсальный проигрыватель";
    }
}
