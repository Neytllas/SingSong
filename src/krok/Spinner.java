package krok;

public class Spinner extends Apparatus
{
    @Override
    public boolean check(Drive dr)
    {
        return dr instanceof Vinyl;
    }

    @Override
    public String getName()
    {
        return "виниловый проигрыватель";
    }
}
