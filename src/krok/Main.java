package krok;

public class Main {

    public static void main(String[] args)
    {
	    Spinner spinner = new Spinner("OPOPOPOP", "Воспроизводится на виниле");
	    Player player = new Player("Вот эта песня", "Воспроизводится с флешки");
	    CD cd = new CD("И это песня","Воспроизводится на диске");
    }
}
