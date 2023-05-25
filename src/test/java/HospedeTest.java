import designpattern.comportamentais.Hospede;
import designpattern.comportamentais.Hotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {
    @Test
    void deveNotificarHospede()
    {
        Hospede hospede = new Hospede("Caio Ferreira");
        Hotel hotel = new Hotel("Pallas Hotel", 302, "Suíte Master" );
        hospede.manifestarInteresse(hotel);
        hotel.toCheckout();
        assertEquals("Caio Ferreira, houve uma nova alteração sobre o hotel { Pallas Hotel o quartoSuíte Masterde nº 0ficou disponivel!!! }", hospede.getUltimaNotificacao());
    }

    @Test
    void deveNotificarHospedes()
    {
        Hospede hospede1 = new Hospede("Caio Ferreira");
        Hospede hospede2 = new Hospede("Fernanda Almeida");
        Hotel hotel = new Hotel("Pallas Hotel", 302, "Suíte Master" );
        hospede1.manifestarInteresse(hotel);
        hospede2.manifestarInteresse(hotel);
        hotel.toCheckout();
        assertEquals("Caio Ferreira, houve uma nova alteração sobre o hotel { Pallas Hotel o quartoSuíte Masterde nº 0ficou disponivel!!! }", hospede1.getUltimaNotificacao());
        assertEquals("Fernanda Almeida, houve uma nova alteração sobre o hotel { Pallas Hotel o quartoSuíte Masterde nº 0ficou disponivel!!! }", hospede2.getUltimaNotificacao());

    }

    @Test
    void naodeveNotificarHospede()
    {
        Hospede hospede = new Hospede("Caio Ferreira");
        Hotel hotel = new Hotel("Pallas Hotel", 302, "Suíte Master" );
        hotel.toCheckout();
        assertEquals(null, hospede.getUltimaNotificacao());
    }

    @Test
    void deveNotificarHospedeInterassadoDeterminadoHotel()
    {
        Hospede hospede = new Hospede("Caio Ferreira");
        Hospede hospede2 = new Hospede("Fernanda Almeida");
        Hotel hotel = new Hotel("Pallas Hotel", 302, "Suíte Master" );
        Hotel hotel2 = new Hotel("Gran Hotel", 401, "Hiper Suíter Vip" );
        hospede.manifestarInteresse(hotel);
        hospede2.manifestarInteresse(hotel2);
        hotel.toCheckout();
        assertEquals("Caio Ferreira, houve uma nova alteração sobre o hotel { Pallas Hotel o quartoSuíte Masterde nº 0ficou disponivel!!! }", hospede.getUltimaNotificacao());
        assertEquals(null, hospede2.getUltimaNotificacao());

    }


}
