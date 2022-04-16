package Week1_04_04_22;

public class Home {
    public static void main(String[] args) {
        Toy trex = new Dinosaur(
                "Tiranosaurio Rex azul",
                5,
                2,
                "t-rex",
                "azul"
        );
        Toy cat = new Animal(
                "Gato negro",
                2,
                5,
                "gato",
                "negro"
        );
        Toy car = new Toy(
                "Rayo McQueen",
                7,
                3
        );

        KinderSurprise kinder1 = new KinderSurprise(trex);
        kinder1.open();
        kinder1.getToy().open();
        kinder1.getToy().assemble();
        kinder1.getToy().pasteStickers();

        System.out.println("\n");
        kinder1.setToy(cat);
        kinder1.open();
        kinder1.getToy().open();
        kinder1.getToy().assemble();
        kinder1.getToy().pasteStickers();

        System.out.println("\n");
        kinder1.setToy(car);
        kinder1.open();
        kinder1.getToy().open();
        kinder1.getToy().assemble();
        kinder1.getToy().pasteStickers();
    }
}
