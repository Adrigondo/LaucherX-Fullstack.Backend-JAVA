package Week3_18_04_22.practicaMultiverse;

public class PeterParker implements Spiderman{
    int atk_pts = 0; // Newtons
    int special_duration = 0; // Turns
    String name = "Peter Parker";

    PeterParker(){
        atk_pts=20;
        special_duration=5;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swing() {
        System.out.println(this.name+" usa sus cartuchos de telaraña para columpiarse!");
    }

    @Override
    public int attack() {
        System.out.println(this.name+" se columpia embistiendo golpes rapidos al enemigo!");
        return atk_pts;
    }

    @Override
    public int specialAttack() {
        System.out.println(this.name+" lanza telaraña a la cara de su oponente dejandolo sin vision!");
        return special_duration;
    }

    @Override
    public int strongAttack() {
        System.out.println(this.name+" usa telaraña para impulsarse y dar un fuerte golpe al enemigo!");
        return (int)(atk_pts*1.4);
    }
}
