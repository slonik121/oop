import java.util.ArrayList;
import java.math.BigDecimal;

class NumberOperations {

    public static void main(String[] args) {
        System.out.println("Лабораторно робота №1 \nНіколаєнко Софія КМ-32 \nВаріант №1\n\n");

        // Початковий список
        ArrayList<Number> NumbList = new ArrayList<>();
        NumbList.add(10); NumbList.add(20.5); NumbList.add(30); NumbList.add(40.7); NumbList.add(50);
        NumbList.add(60.3); NumbList.add(70); NumbList.add(80.1); NumbList.add(90); NumbList.add(100.9);

        System.out.println("Початковий список: " + NumbList);

        ArrayList<Integer> IntegerList = new ArrayList<>();
        ArrayList<Integer> RoundedList = new ArrayList<>();
        ArrayList<Double> DoubleList = new ArrayList<>();
        ArrayList<Float> FloatList = new ArrayList<>();
        ArrayList<BigDecimal> BigDecimalList = new ArrayList<>();

        // Округлі числа
        for (Number num : NumbList) {
            if (num instanceof Double) {
                RoundedList.add((int) Math.ceil((Double) num));
            } else if (num instanceof Integer) {
                RoundedList.add((Integer) num);
            }
        }

        // Цілі числа
        for (Number num : NumbList) {
            if (num instanceof Double) {
                IntegerList.add(((Double) num).intValue());
            } else if (num instanceof Integer) {
                IntegerList.add((Integer) num);
            }
        }

        // Дробові числа з двома знаками після коми
        for (Number num : NumbList) {
            if (num instanceof Double) {
                DoubleList.add(Math.round((Double) num * 100.0) / 100.0);
            } else if (num instanceof Integer) {
                DoubleList.add((double) Math.round((Integer) num * 100.0) / 100.0);
            }
        }

        System.out.println("Округлений список: " + RoundedList);
        System.out.println("Цілий список: " + IntegerList);

        // Виведення дробових чисел
        System.out.print("Дробовий список: [");
        for (int i = 0; i < DoubleList.size(); i++) {
            System.out.printf("%.2f", DoubleList.get(i));
            if (i < DoubleList.size() - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");

        // Перетворення у BigDecimal
        for (Number num : NumbList) {
            if (num instanceof Double) {
                BigDecimalList.add(BigDecimal.valueOf((Double) num));
            } else if (num instanceof Integer) {
                BigDecimalList.add(BigDecimal.valueOf((Integer) num));
            }
        }

        System.out.println("Список BigDecimal: " + BigDecimalList);

        //розподіл за типами
        ArrayList<Integer> IntegerTypeList = new ArrayList<>();
        ArrayList<Float> FloatTypeList = new ArrayList<>();
        ArrayList<Double> DoubleTypeList = new ArrayList<>();

        for (Number num : NumbList) {
            if (num instanceof Integer) {
                IntegerTypeList.add((Integer) num);
            } else if (num instanceof Float) {
                FloatTypeList.add((Float) num);
            } else if (num instanceof Double) {
                DoubleTypeList.add((Double) num);
            }
        }

        System.out.println("Список int: " + IntegerTypeList);
        System.out.println("Список float: " + FloatTypeList);
        System.out.println("Список double: " + DoubleTypeList);
    }
}
