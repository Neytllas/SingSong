package krok;

import java.util.ArrayList;

public class Type
{
    private String song; // класс родитель

        public Type (String song)
        {
            this.song = song; // общий тип - песня
        }

        public String getSong()
        {
            return song;
        }
}

class Player extends Type // класс наследник - вертушка
{
    private String flash; // имеет собственный тип - винил

    public Player(String song, String flash) // конструктор
    {
        super(song);
        this.flash = flash;
    }

    public String getFlash ()
    {
        return flash;
    }
}

class CD extends Type // класс наследник - вертушка
{
    private String cd; // имеет собственный тип - винил

    public CD(String song, String  cd) // конструктор
    {
        super(song);
        this.cd = cd;
    }

    public String getCd ()
    {
        return cd;
    }
}


class Spinner extends Type // класс наследник - вертушка
{
    private String vinyl; // имеет собственный тип - винил

    public Spinner(String song, String vinyl) // конструктор
    {
        super(song);
        this.vinyl = vinyl;
    }

    public String getVinyl ()
    {
        return vinyl;
    }
}

/*
class MusicalApparatus extends Type
{
    private ArrayList<Type> types = new ArrayList<>();
    private String isPlayed;

    public MusicalApparatus(String isPlayed)
    {
        super(isPlayed);
        this.isPlayed = isPlayed;
    }

    public boolean add(Type type)
    {
        if (isPlayed >= type.getSong()) - не может быть потому что строка
        {
            type.add(type);
            isPlayed -=
        }
    }
}
*/


