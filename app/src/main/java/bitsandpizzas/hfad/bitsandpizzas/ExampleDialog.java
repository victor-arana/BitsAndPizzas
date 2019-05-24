package bitsandpizzas.hfad.bitsandpizzas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;

import static android.content.DialogInterface.BUTTON_POSITIVE;

public class ExampleDialog  extends AppCompatDialogFragment implements DialogInterface.OnClickListener {

    private static final int CREDIT_CARD = 0;
    private static final int DEBIT_CARD = 1;
    private static final int CASH = 2;

    String[] singleChoiceItems = {"Credit card", "Debit Card", "Cash"};
    int itemSelected = -1;
    int paymentSelected = -1;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Payment Method")
                .setSingleChoiceItems(singleChoiceItems, itemSelected, this)
                .setPositiveButton("ok", this)
                .setNegativeButton("Cancel", this);
        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which == CREDIT_CARD || which == DEBIT_CARD || which == CASH){
            paymentSelected = which;
        } else if(which == BUTTON_POSITIVE && paymentSelected != -1){
            if(paymentSelected == CREDIT_CARD){
                Intent intent = new Intent(getActivity(), CreditCardPaymentActivity.class);
                startActivity(intent);
            } else if(paymentSelected == DEBIT_CARD){
                Intent intent = new Intent(getActivity(), DebitCardPaymentActivity.class);
                startActivity(intent);
            } else if(paymentSelected == CASH){
                Intent intent = new Intent(getActivity(), CashPaymentActivity.class);
                startActivity(intent);
            }
        }
    }
}
