package com.java.class31;

public class BankMainClass {
    public static void main(String[] args) {
        ChaseBank chiragAccCB = new ChaseBank();
        BankOfAmerica chiragBOA = new BankOfAmerica();
        WellsFargo chiragWf = new WellsFargo();

        PayPal pp = new PayPal();
        pp.checkBalance(chiragAccCB);
        pp.checkBalance(chiragBOA);
        pp.checkBalance(chiragWf);

    }
}
