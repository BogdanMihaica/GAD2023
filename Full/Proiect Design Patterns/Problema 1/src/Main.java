public class Main {
    public static void main(String[] args) {
        Invitat invitat1 = new InvitatIndividual("John");
        Invitat invitat2 = new InvitatIndividual("Jane");
        Invitat invitat3 = new InvitatIndividual("Mike");

        Invitat invitat4 = new InvitatIndividual("Alice");
        Invitat invitat5 = new InvitatIndividual("Bob");
        Invitat invitat6 = new InvitatIndividual("Eve");

        Invitat invitat7 = new InvitatIndividual("Tom");
        Invitat invitat8 = new InvitatIndividual("Lisa");

        Invitat grup1 = new GrupInvitati("Familia Smith");
        grup1.adaugaInvitat(invitat1);
        grup1.adaugaInvitat(invitat2);
        grup1.adaugaInvitat(invitat3);

        Invitat grup2 = new GrupInvitati("Prietenii Alice");
        grup2.adaugaInvitat(invitat4);
        grup2.adaugaInvitat(invitat5);
        grup2.adaugaInvitat(invitat6);

        Invitat grup3 = new GrupInvitati("Colegii Tom");
        grup3.adaugaInvitat(invitat7);
        grup3.adaugaInvitat(invitat8);

        Invitat eveniment = new GrupInvitati("Petrecerea de Crăciun");
        eveniment.adaugaInvitat(grup1);
        eveniment.adaugaInvitat(grup2);
        eveniment.adaugaInvitat(grup3);

        eveniment.afiseazaDetalii();
    }
}
