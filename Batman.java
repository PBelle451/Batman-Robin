package co.pedrobelle.batmanrobin;

public class Batman {
    public static void main(String[] args){
        Robin userA = new Robin("Dick", "Grayson");
        Robin userB = new Robin("Bruce", "Wayne");
        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
    }
}
