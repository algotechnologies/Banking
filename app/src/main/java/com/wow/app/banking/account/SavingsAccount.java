package com.wow.app.banking.account;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.wow.app.banking.R;
import com.wow.app.banking.abstraction.BankAccount;
import com.wow.app.banking.util.Constants;


public class SavingsAccount extends BankAccount {

    public SavingsAccount(Activity activity) {
        Log.d(Constants.TAG, "Savings account is initialized successfully");
        ((TextView) activity.findViewById(R.id.text_view)).append("Account Type: " + "Savings" + "\n");
    }

    @Override
    public BankAccount withdrawl(double amount) {
        double totalAmountAfterInterest = amount + ((amount * Constants.INTEREST_RATE) / 100);
        super.withdrawl(totalAmountAfterInterest);
        return this;
    }

}
