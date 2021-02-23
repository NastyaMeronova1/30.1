import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-6);
        list.add(11);
        list.add(-5);
        list.add(22);

        System.out.println("Value of array list " + list);
        for (int i = 0; i < list.size(); i++) {
            double result = 0;
            try {
                result = cylinderVolume(list.get(i), 11);
            } catch (NegativeValueException e) {
                System.out.print(e.getMessage());
                e.printStackTrace();
            }
            System.out.println(result);
        }
    }
    public static double cylinderVolume(int cylinderBase, int cylinderHeight) throws NegativeValueException {
        //формула для расчёта объёма цилиндра: V = π r2h, V – объем цилиндра, h – высота цилиндра, r – радиус основания, π – 3.14
        double result = 3.14 * cylinderBase * 2 * cylinderHeight;
            if (cylinderBase < 0 || cylinderHeight < 0) {
                throw new NegativeValueException("Negative Value Exception " + cylinderBase);
            }
        return result;
    }
}


