import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//        DVD d = new DVD(23,12,1.48,"Terminator","James Cameron");
//        CD c = new CD(19,16,.34,"The Real Deal","Some one Great");
//        Teacup t = new Teacup(3,43,330);
//
//        System.out.println(d.getDirector());
//        System.out.println(d.rentalCost());
//        d.play();
//        System.out.println(d.getPrice());
//
//        System.out.println(c.getArtist());
//        System.out.println(c.getNumStock());
//        c.play();
//        System.out.println(c.getTitle());
//        System.out.println(c.getPrice());
//
//        System.out.println(t.getVolumeOfTea());
//        System.out.println(t.getNumStock());
//        System.out.println(t.getPrice());
//        System.out.println(t.getClass());

//        DVD  myDVD = new DVD (11.17 , 9, 102,"Your  Name", "Makoto  Shinkai");
//        Playable  myPlayable = myDVD; // what does this mean
//        DVD myDVD2 = myDVD;
//        myDVD2 = (DVD) myPlayable;
//        System.out.println(myDVD2.getDirector());
//        //System.out.println((myPlayable).getDirector());

        ArrayList<Playable> ary = new ArrayList<>();

        ary.add(new DVD(11.17 , 9, 102,"Your  Name", "Makoto  Shinkai"));
        ary.add(new CD(19.99,16,.34,"The Real Deal","Some one Great"));
        ary.add(new CD(14.50,234,.43,"Assassin","EBEN"));
        ary.add(new CD (17.80,18,.38,"superfly","2Scractch"));
        ary.add(new DVD(25.67,16,.34,"The Real Deal","Some one Great"));
        ary.add(new DVD (29.99,23,2.01,"Terminator 2 JudgmentDay","James Cameron"));
        ary.add(new CD(16.67,6,.45,"Movements","Pham"));
        ary.add(new DVD(32.69,17,1.49,"Terminator 3: rise of the machines","Jonathan Mostow"));
        ary.add(new DVD(35.99,28,1.58,"Terminator Salvation","McG"));

        for (Playable elem: ary) {
            System.out.println(elem.getTitle());
            System.out.println(elem.getRuntime());
            System.out.println(elem.rentalCost());
            elem.play();
            //System.out.println((CD) elem.getArtist());
        }

    }
}
