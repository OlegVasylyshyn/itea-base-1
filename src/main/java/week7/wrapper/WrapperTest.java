package week7.wrapper;

public class WrapperTest {

    public static void main(String[] args) {
        // int
        Integer num = new Integer(1);
        Integer num2 = 2;   // inboxing     (outboxing)
        int num3 = num2;    // outboxing    (outboxing)

        // outboxing
        if(3 > num) {
            System.out.println("Ok");
        }

        // long
        Long l = 1L;

        // double
        Double d = 1.2;

        // char
        Character c = 'c';

        Boolean b = false;          // wrong  new Boolean("false")
        Boolean b2 = Boolean.FALSE; // right

        Boolean b3 = new Boolean("gsgsdgsd");
        System.out.println(b3);


        float f = Float.parseFloat("4.5");
        System.out.println(f);

        int maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);

    }
}
