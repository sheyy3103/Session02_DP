package factory_pattern.enity;

import factory_pattern.en.BankType;
import factory_pattern.itf.Bank;

public class BankFactory {
    public BankFactory() {
    }

    public static Bank getBank(BankType bt){
        if (bt == BankType.TPBank)
            return new TPBank();
        else
            return new VCBank();
    }
}
