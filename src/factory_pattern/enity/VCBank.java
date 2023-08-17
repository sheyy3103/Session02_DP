package factory_pattern.enity;

import factory_pattern.itf.Bank;

public class VCBank implements Bank {
    @Override
    public String getBankName() {
        return "This is VC Bank";
    }
}
