package Week3_18_04_22.practicaMona;

public class TestMona {
    public static void main(String[] args) {
        testSaintNic();
        System.out.println(" ");
        testHula();
        System.out.println(" ");
        testJustice();
        System.out.println(" ");
        testMax();
        System.out.println(" ");
        testSurf();
        System.out.println(" ");
        testSkate();
    }
    static void testSkate(){
        SkateToCat skate = new SkateToCat(
                "SurfCat",
                "Femenino",
                "Caidas 3000"
        );
        skate.putEquipment();
        skate.rideSkateboard();
    }
    static void testSurf(){
        SurfToCat surf = new SurfToCat(
                "SurfCat",
                "Masculino",
                "Jhonny",
                "Azul con algas"
        );
        surf.surf();
        surf.swim();
    }
    static void testMax(){
        MaxToCat max = new MaxToCat(
                "StatueCat",
                "Masculino"
        );
        max.balance();
        max.dontMove();
    }
    static void testJustice(){
        JusticeToCat justice = new JusticeToCat(
                "JusticeCat",
                "Femenino"
        );
        justice.judge();
        justice.beFair();
    }
    static void testHula(){
        HulaToCat hula = new HulaToCat(
                "HulaCat",
                "Masculino",
                "paco",
                "Amarilla con flores"
        );
        hula.playSong("Something in the way - Nirvana");
        hula.dance();
    }
    static void testSaintNic(){
        SaintNicToCat saintNic = new SaintNicToCat(
                "Santa Claus",
                "Masculino",
                new String[] {"Paco", "Rodolfo", "Mark Spector", "Peter parker", "Finn", "Jake", "Jim Mc.Gill"},
                new String[] {"Pelota de futblol", "Barbie luchadora", "Buz lightyear"}
        );

        saintNic.rideSled();
        saintNic.deliverGifts();
    }
}
