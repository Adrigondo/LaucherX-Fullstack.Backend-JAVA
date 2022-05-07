package Week3_18_04_22.practicaMultiverse;

public class MilesMorales implements Spiderman{
    int atk_pts = 0; // Newtons
    int special_duration = 0; // Turns
    String name = "Miles Morales";

    MilesMorales(){
        atk_pts=18;
        special_duration=3;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swing() {
        System.out.println(this.name+" planea un poco luego se columpia y vuelve a planear!");
    }

    @Override
    public int attack() {
        System.out.println(this.name+" se acerca planeando al enemigo y ensesta un golpe seguido por una patada!");
        return atk_pts;
    }

    @Override
    public int specialAttack() {
        System.out.println(this.name+" electrifica su telaraña dejando en shock al enemigo!");
        return special_duration;
    }

    @Override
    public int strongAttack() {
        System.out.println(this.name+" despista al enemigo planeando y lo embiste con una patada!");
        return (int)(atk_pts*1.5);
    }
}
