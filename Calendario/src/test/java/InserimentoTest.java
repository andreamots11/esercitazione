import org.example.Calendario;
import org.example.Evento;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class InserimentoTest {
        @Test
        public void testAddEvent() {
            Calendario calendar = new Calendario();
            Evento event = new Evento("AAA", "BBB",1,1,2022);
            calendar.addEvent(event);
            assertEquals(1, calendar.getEvents().size());
            assertEquals(event, calendar.getEvents().get(0));
        }
    }

