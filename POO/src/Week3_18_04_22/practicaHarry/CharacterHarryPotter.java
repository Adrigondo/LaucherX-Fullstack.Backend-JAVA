package Week3_18_04_22.practicaHarry;

public class CharacterHarryPotter {
    String name="";
    String house="";
    String genre="";
    String boggart="";
    String patronus="";

    // CONSTRUCTOR
    CharacterHarryPotter(){}
    CharacterHarryPotter(String name, String house, String genre, String boggart, String patronus){
        this.name=name;
        this.house=house;
        this.genre=genre;
        this.boggart=boggart;
        this.patronus=patronus;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public String getGenre() {
        return genre;
    }

    public String getBoggart() {
        return boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    // METHODS
    void seeBoggart(){
        String msg;
        if(this.patronus==""){
            msg="Aún no se conoce la forma de un boggart es visto por"+this.name+".";
        }else if(this.patronus=="NO DESCUBIERTO"){
            msg=this.name+" aun no ha visto un boggart. ";
        }else{
            msg=this.name+" esta viendo su peor miedo, "+this.boggart;
        }
        System.out.println(msg);
    }
    void invokePatronus(){
        String msg;
        if(this.patronus==""){
            msg="Aún no se conoce el patronus de "+this.name+".";
        }else if(this.patronus=="NO DESCUBIERTO"){
            msg=this.name+" aun no descubre su patronus. ";
        }else{
            msg=this.name+" ha invocado a su Pattronus "+this.patronus;
        }
        System.out.println(msg);
    }

    public static void main(String[] args) {
        CharacterHarryPotter harry = new CharacterHarryPotter(
                "Harry James Potter",
                "Glyffindor",
                "Masculino",
                "Dementor",
                "Ciervo"
        );
        CharacterHarryPotter hermione = new CharacterHarryPotter(
                "Hermione Jean Granger",
                "Glyffindor",
                "Femenino",
                "La profesora McGonagall diciéndole que reprobó todo",
                "Nutria"
        );
        CharacterHarryPotter malfoy = new CharacterHarryPotter();
        CharacterHarryPotter snape = new CharacterHarryPotter(
                "Severus Snape",
                "Slytherins",
                "Masculino",
                "Lord Voldemort",
                "Cierva"
        );
        CharacterHarryPotter newt = new CharacterHarryPotter(
                "Newton Artemis Fido Scamander",
                "Hufflepuff",
                "Masculino",
                "Un escritorio de oficina",
                ""
        );

        harry.seeBoggart();
        harry.invokePatronus();

        System.out.println("");

        hermione.seeBoggart();
        hermione.invokePatronus();

        System.out.println("");

        malfoy.setName("Draco Lucius Malfoy Black");
        malfoy.setHouse("Slytherins");
        malfoy.setGenre("Masculino");
        malfoy.setBoggart("Lord Voldemort");
        malfoy.setPatronus("NO DESCUBIERTO");
        malfoy.invokePatronus();
        malfoy.seeBoggart();

        System.out.println("");

        snape.seeBoggart();
        snape.invokePatronus();

        System.out.println("");

        newt.seeBoggart();
        newt.invokePatronus();

        System.out.println("");
    }
}
