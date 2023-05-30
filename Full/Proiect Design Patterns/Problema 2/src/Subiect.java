import java.util.ArrayList;
import java.util.List;

// Clasa abstractă pentru Subiect
abstract class Subiect {
    private List<Observator> observatori = new ArrayList<>();

    public void adaugaObservator(Observator observator) {
        observatori.add(observator);
    }

    public void eliminaObservator(Observator observator) {
        observatori.remove(observator);
    }

    public void notificaObservatori(String eveniment) {
        for (Observator observator : observatori) {
            observator.actualizare(eveniment);
        }
    }
}
