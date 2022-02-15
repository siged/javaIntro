package hashcodeequals;

import java.util.Objects;

public class HashCodeEqualsTest {
    private String paint;
    private String shape;
    private int id;
    private int regNumber;
    private String name;

    public static void main(String[] args) {
        HashCodeEqualsTest test1 = new HashCodeEqualsTest();
        HashCodeEqualsTest test2 = new HashCodeEqualsTest();
        test1.paint = "green";
        test2.paint = "green";
        // test1 = null;
        //test2 = null;
        test1.id = 1;
        test1.regNumber = 23;
        test1.name = "name1";
        test1.shape = "square";
        test2.id = 1;
        test2.regNumber = 23;
        test2.name = "name1";
        test2.shape = "square";
        String color1 = new String("green");
        String color2 = new String("green");
        //System.out.println(test1.equals(test2));
        // System.out.println(color1.equals(color2));
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeEqualsTest test = (HashCodeEqualsTest) o;
        return id == test.id && regNumber == test.regNumber && paint.equals(test.paint) && shape.equals(test.shape) && name.equals(test.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (shape == null ? 0 : shape.hashCode());
        hash = 31 * hash + (int) regNumber;
        hash = 31 * hash + (paint == null ? 0 : paint.hashCode());
        return hash;
    }
}
