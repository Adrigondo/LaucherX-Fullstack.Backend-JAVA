package Week3_18_04_22.practicaMultiverse;

public interface Spiderman {
    String name = "";
    int atk_pts = 0; // Newtons
    int special_duration = 0; // Turns
    public String getName();

    public void swing();
    public int attack();
    public int specialAttack();
    public int strongAttack();
}
