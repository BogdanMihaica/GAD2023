// Clasa abstractă pentru Observator
abstract class Observator {
    protected String nume;

    public Observator(String nume) {
        this.nume = nume;
    }

    public abstract void actualizare(String eveniment);
}
