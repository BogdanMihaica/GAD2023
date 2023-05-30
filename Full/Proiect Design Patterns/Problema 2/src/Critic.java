// Clasa pentru abonații de tip Critic
class Critic extends Observator {
    public Critic(String nume) {
        super(nume);
    }

    public void actualizare(String eveniment) {
        System.out.println(nume + " a primit notificare: " + eveniment);
    }
}
