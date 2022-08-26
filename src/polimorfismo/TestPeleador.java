package polimorfismo;

public class TestPeleador {

    public static void main(String[] args) {
        Peleador chuck = new Karate();
        Peleador cook = new Taekwondo();
        Peleador ali = new Boxeo();

        Boxeo bruce = new Boxeo();
        bruce.pelear();//muestra el del padre, pero se considera ilegal, debería de sobreescribirse o usar sper.
        //bruce.fintear();
      Taekwondo bruca = new Taekwondo();
//       Boxeo bruxe = (Boxeo) cook;
      // cook.fintear();
        bruce.pelear();

        Peleador fighter[] = new Peleador[4];

        fighter[0] = bruce;
        fighter[1] = chuck;
        fighter[2] = cook;
        fighter[3] = ali;
        for (int i = 0; i < fighter.length;) {
            fighter[i++].pelear();
        }

        Pelión narva = new Pelión();
        narva.pelear(ali);
        narva.pelear(chuck);
        narva.pelear(cook);
        narva.pelear(bruce);
    }
}
