public class Main {
    public static void main(String[] args) {
        GameEntity a1 = new Alok(-45,"active","heling") ;
        System.out.println("Alok age\n " + a1.getAge() + "\n" );
        GameEntity a2 = new Kelli(20,"passive","fast treatment","run") ;
        System.out.println("Kelli age\n" + a2.getAge() + "\n");
        GameEntity a3 = new Gomer(-50,"active","Drone attack","dexterity",45) ;
        System.out.println("Gomer age\n" + a3.getAge() + "\n" );

    }
}