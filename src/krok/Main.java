package krok;

public class Main {

    public static void main(String[] args)
    {
        Song s = new Song ("Название ", "Альбом");
        Drive f = new Flash();

        // Drive f = new Vinyl(); - консоль выведет "Плеер не может проигрывать устройство Виниловая пластинка" ну и все в этом духе))

        f.song = s;
        Apparatus p = new Player();
        p.Play(f);
    }
}
