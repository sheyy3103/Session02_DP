package factory_pattern.enity;

import factory_pattern.itf.Bank;

public class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "This is TP Bank";
    }
}
