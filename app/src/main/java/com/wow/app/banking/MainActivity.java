package com.wow.app.banking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wow.app.banking.abstraction.BankAccount;
import com.wow.app.banking.accounts.CheckingAccount;
import com.wow.app.banking.accounts.SavingsAccount;

public class MainActivity extends AppCompatActivity {

    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Objects
        init();
    }

    private void init() {
        textView = findViewById(R.id.text_view);

        BankAccount bankAccount;

        bankAccount = new CheckingAccount(this);
        bankAccount.open("Saad Aftab", 44446767);
        bankAccount.deposit(1000);
        bankAccount.withdrawl(100);

        displayInfo(bankAccount);

        bankAccount = new SavingsAccount(this);
        bankAccount.open("Hammad Aftab", 55556767);
        bankAccount.deposit(1000);
        bankAccount.withdrawl(100);

        displayInfo(bankAccount);
    }

    // Display data on screen
    private void displayInfo(BankAccount bankAccount) {
        textView.append("Account Title: " + bankAccount.getAccountTitle() + "\n");
        textView.append("Account Number: " + bankAccount.getAccountNumber() + "\n");
        textView.append("Account Balance: " + bankAccount.getAccountBalance() + "\n\n");
    }

}
