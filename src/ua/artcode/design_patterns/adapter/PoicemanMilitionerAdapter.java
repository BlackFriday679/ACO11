package ua.artcode.design_patterns.adapter;

/**
 * Created by serhii on 21.02.16.
 */
public class PoicemanMilitionerAdapter extends PoliceMan {

    private Militioner militioner;

    public PoicemanMilitionerAdapter(Militioner militioner) {
        this.militioner = militioner;
    }

    @Override
    public void doGoodJob() {
        militioner.serve();
    }
}
