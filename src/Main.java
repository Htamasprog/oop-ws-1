public class Main {

    public static void main(String[] args) {

        Range range1 = new Range(1, 2);
        Range range2 = new Range(2, 3);

        System.out.println(range1.getStart());

        range1.setStart(3);
        range2.setStart(5);

        System.out.println(range1.getStart());

        System.out.println(range2.getStart());


    }



}
