package factory_pattern.run;

import factory_pattern.en.BankType;
import factory_pattern.enity.BankFactory;
import factory_pattern.itf.Bank;

public class Client {
    public static void main(String[] args) {

        System.out.println();

        Bank vcb = BankFactory.getBank(BankType.VCBank);
        Bank tpb = BankFactory.getBank(BankType.TPBank);

        System.out.println(vcb.getBankName());
        System.out.println(tpb.getBankName());

    }
}
