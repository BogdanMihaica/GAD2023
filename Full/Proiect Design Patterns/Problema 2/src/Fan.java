// Clasa pentru abonații de tip Fan
class Fan extends Observator {
    public Fan(String nume) {
        super(nume);
    }

    public void actualizare(String eveniment) {
        System.out.println(nume + " a primit notificare: " + eveniment);
    }
}
