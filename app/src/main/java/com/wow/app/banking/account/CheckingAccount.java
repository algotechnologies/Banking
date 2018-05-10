package com.wow.app.banking.account;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.wow.app.banking.R;
import com.wow.app.banking.abstraction.BankAccount;
import com.wow.app.banking.util.Constants;


public class CheckingAccount extends BankAccount {

    public CheckingAccount(Activity activity) {
        Log.d(Constants.TAG, "Checking account is initialized successfully");
        ((TextView) activity.findViewById(R.id.text_view)).append("Account Type: " + "Checking" + "\n");
    }

}
