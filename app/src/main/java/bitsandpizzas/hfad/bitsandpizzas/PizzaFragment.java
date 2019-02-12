package bitsandpizzas.hfad.bitsandpizzas;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class PizzaFragment extends ListFragment {


    @Override
    public View onCreateView(
                    LayoutInflater inflater,
                    ViewGroup container,
                    Bundle savedInstanceState) {

        // The ArrayAdapter populates the ListFragment's ListView with the
        // pizza names.
        ArrayAdapter<String>
                adapter =
                    new ArrayAdapter<>(
                            inflater.getContext(),
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.pizzas)
                            );
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
