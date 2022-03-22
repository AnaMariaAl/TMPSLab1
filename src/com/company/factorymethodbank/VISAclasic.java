package com.company.factorymethodbank;

public class VISAclasic extends TypeCard{
    public VISAclasic() {
        setCreditAmount();
    }
    @Override
    public void setCreditAmount() {
        Amount=100000;
    }
}
