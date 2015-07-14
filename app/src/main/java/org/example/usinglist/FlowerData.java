package org.example.usinglist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ? on 01.07.2015.
 */
public class FlowerData {

    private List<Flower> Flowers = new ArrayList<Flower>();

    public List<Flower> getFlowers() {
        return Flowers;
    }

    public FlowerData() {
        Flowers.add(new Flower("Azalea", R.drawable.az, "asdf asfdasdf asdfasd fasdf asdf asdf asfda sfasd dsf"));
        Flowers.add(new Flower("Tibouchina Semidecandra", R.drawable.tib, "qwer qwerqwer qwerqwerqw erqwe qrwe qwerqw rq"));
        Flowers.add(new Flower("Hibiscus", R.drawable.hib, "zxccvxcv zxcv zxcv xvc zxcv zxcv zxcvzxczxvc"));
    }

}
