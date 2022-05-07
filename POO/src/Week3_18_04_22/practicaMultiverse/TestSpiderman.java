package Week3_18_04_22.practicaMultiverse;

public class TestSpiderman {
    static String msg;
    static int value;
    static int time;
    static String name;
    public static void main(String[] args) {
        testSpiderman(new PeterParker());
        System.out.println(" ");
        testSpiderman(new MilesMorales());
        System.out.println(" ");
        testSpiderman(new GwenStacy());
    }
    static void testSpiderman(Spiderman spidy){
        name=spidy.getName();

        spidy.swing();

        value=spidy.attack();
        msg=name+" infligió "+value+"pts de daño";
        printFightInfo(msg);

        time=spidy.specialAttack();
        msg="El efecto dura " + time + " turnos. ";
        printFightInfo(msg);

        value=spidy.strongAttack();
        msg=name+" infligió "+value+" pts de daño";
        printFightInfo(msg);
    }

    static void printFightInfo(String msg){
        System.out.println("\t["+msg+"]");
    }
}
