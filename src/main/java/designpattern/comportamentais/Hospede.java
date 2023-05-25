package designpattern.comportamentais;

import java.util.Observable;
import java.util.Observer;

public class Hospede implements Observer {
    private String name;
    private String ultimaNotificacao;

    public Hospede(String name)
    {
        this.name = name;
    }

    public String getUltimaNotificacao()
    {
        return this.ultimaNotificacao;
    }

    public void manifestarInteresse(Hotel hotel)
    {
        hotel.addObserver(this);
    }

    @Override
    public void update(Observable quarto, Object arg1) {
        this.ultimaNotificacao = this.name + ", houve uma nova alteração sobre o " + quarto.toString();
    }
}
