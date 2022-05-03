package Week3_18_04_22.practicaMona;

public class Mona {
    String name;
    String genre;
    Mona(String name, String genre){
        this.name=name;
        this.genre=genre;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //GETTERS
    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }

    void beCool(){
        String msg=name+" es cool!";
        System.out.println(msg);
    }
}


