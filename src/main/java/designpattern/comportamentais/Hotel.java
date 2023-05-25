package designpattern.comportamentais;

import java.util.Observable;

public class Hotel extends Observable {
    private String hotelName;
    private int numberRoom;
    private String descriptionRoom;

    public Hotel(String hotelName, int numnberRoom, String description)
    {
        this.hotelName = hotelName;
        this.numberRoom = numberRoom;
        this.descriptionRoom = description;
    }

    public void toCheckout()
    {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString()
    {
        return "hotel { " + hotelName + " o quarto" + descriptionRoom + "de nº " + numberRoom + "ficou disponivel!!! }";
    }

}
