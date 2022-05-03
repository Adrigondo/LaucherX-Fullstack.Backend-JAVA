package Week3_18_04_22.practicaMona;

public class TestMona {
    public static void main(String[] args) {
        testSaintNic();
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
