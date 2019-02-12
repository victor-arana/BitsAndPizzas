package bitsandpizzas.hfad.bitsandpizzas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {


    private static final String TAG = "TopFragment";

    public TopFragment() {
        // Required empty public constructor
    }

    /**
     * After the onCreate() is called (in the Fragment), the Fragment's onCreateView()
     * is called. You can assign your View variables and do any graphical initialisations.
     *
     * Fragments use a layout inflater to create their view at this stage.
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG, "Entering onCreateView");
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

}
