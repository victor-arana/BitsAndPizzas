package bitsandpizzas.hfad.bitsandpizzas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class ExampleDialog  extends AppCompatDialogFragment implements DialogInterface.OnClickListener {

    String[] singleChoiceItems = {"Credit card", "Cash", "Coupon"};
    int itemSelected = 0;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Payment Method")
                .setSingleChoiceItems(singleChoiceItems, itemSelected, this)
                .setPositiveButton("ok", null)
                .setNegativeButton("Cancel", null);
        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        // Do nothing
    }
}
