package DEMO;
class AA {
    AA () {
        System.out.println("It is AA class Constructor");
    }
}
class BB extends AA {
    BB () {
        System.out.println("It is a BB class Constructor");
    }
}
class CC extends BB {
    CC () {
        System.out.println("It is CC class Constructor");
    }
}
public class DEMO1 {
    public static void main(String [] args) {


        AA obj = new AA();
    }
}
