package bitsandpizzas.hfad.bitsandpizzas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PizzaFragment extends Fragment {


    @Override
    public View onCreateView(
                    LayoutInflater inflater,
                    ViewGroup container,
                    Bundle savedInstanceState) {


        RecyclerView pizzaRecycler =
                (RecyclerView) inflater
                        .inflate(R.layout.fragment_pizza, container, false);

        pizzaRecycler.setAdapter(new CaptionedImagesAdapter(retrievePizzaNames(), retrievePizzaImages()));
        pizzaRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return pizzaRecycler;
    }

    private int[] retrievePizzaImages() {
        int[] pizzaImages = new int[Pizza.pizzas.length];
        for (int i = 0; i < pizzaImages.length; i++) {
            pizzaImages[i] = Pizza.pizzas[i].getImageResourceId();
        }
        return pizzaImages;
    }

    private String[] retrievePizzaNames() {
        String[] pizzaNames = new String[Pizza.pizzas.length];
        for(int i = 0; i < pizzaNames.length; i++){
            pizzaNames[i] = Pizza.pizzas[i].getName();
        }
        return pizzaNames;
    }
}
