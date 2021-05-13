package com.Sevent;

public class Parked_CarOwner_Details
{
    String ownName;
    String cModel;
    Integer carNo;
    Long phno;
    String add;
    
    @Override
    public String toString() {
        return "Parked_CarOwner_Details [ownName=" + this.ownName + ", cModel=" + this.cModel + ", carNo=" + this.carNo + ", phno=" + this.phno + ", add=" + this.add + "]";
    }
    
    public Parked_CarOwner_Details(final String ownName, final String cModel, final Integer carNo, final Long ownerMobileNo, final String address) {
        this.ownName = ownName;
        this.cModel = cModel;
        this.carNo = carNo;
        this.phno = phno;
        this.add = add;
    }
    
    public String getOwnerName() {
        return this.ownName;
    }
    
    public void setOwnerName(final String ownName) {
        this.ownName = ownName;
    }
    
    public String getCarModel() {
        return this.cModel;
    }
    
    public void setCarModel(final String cModel) {
        this.cModel = cModel;
    }
    
    public Integer getCarNo() {
        return this.carNo;
    }
    
    public void setCarNo(final Integer carNo) {
        this.carNo = carNo;
    }
    
    public Long getphno() {
        return this.phno;
    }
    
    public void setphno(final Long phno) {
        this.phno = phno;
    }
    
    public String getadd() {
        return this.add;
    }
    
    public void setadd(final String add) {
        this.add = add;
    }
}