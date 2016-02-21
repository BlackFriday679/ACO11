package ua.artcode.design_patterns.adapter;

/**
 * Created by serhii on 21.02.16.
 */
public class Test {


    public static void main(String[] args) {

        PoliceDepartment.accept(new PoliceMan());

        PoliceDepartment.accept(new PoicemanMilitionerAdapter(new Militioner()));
    }
}
