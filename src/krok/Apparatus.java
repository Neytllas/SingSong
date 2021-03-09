package krok;
// класс родитель аппаратов воспроизведения
public class Apparatus
{
    public String getName()
    {
        return "";
    };

    public boolean check (Drive dr)
    {
        return false;
    }

    public void Play (Drive dr)
    {
        if (check (dr))
            System.out.println("Играет: " + dr.song.Title + dr.song.Album + " воспроизводит " + this.getName() + " с устройства " + dr.getName());

        else
        {
            System.out.println(this.getName() + " не может проигрывать устройство " + dr.getName());
        }
    }
}

