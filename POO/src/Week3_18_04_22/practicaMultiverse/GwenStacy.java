package Week3_18_04_22.practicaMultiverse;

public class GwenStacy implements Spiderman {
    int atk_pts = 0; // Newtons
    int special_duration = 0; // Turns
    String name = "Gwen Stacy";

    GwenStacy(){
        atk_pts=22;
        special_duration=2;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swing() {
        System.out.println(this.name+" se columpia en saltos cortos pero muy veloces!");
    }

    @Override
    public int attack() {
        System.out.println(this.name+" columpiandose velozmente, embiste filosos golpes y patadas al enemigo!");
        return atk_pts;
    }

    @Override
    public int specialAttack() {
        System.out.println(this.name+" rodea al enemigo de telaraña dejandolo inmovil!");
        return special_duration;
    }

    @Override
    public int strongAttack() {
        System.out.println(this.name+" sujeta al enemigo con una telaraña y se acerca embistiendolo con un torbellino de patadas!");
        return (int)(atk_pts*1.6);
    }
}