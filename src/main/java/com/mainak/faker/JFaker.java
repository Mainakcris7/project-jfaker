package com.mainak.faker;

public class JFaker {
    public FakeAddress address(){
        return new FakeAddress();
    }
    public FakeCommerce commerce(){
        return new FakeCommerce();
    }
    public FakeDate date(){
        return new FakeDate();
    }
    public FakeEducation education(){
        return new FakeEducation();
    }
    public FakeEntertainment entertainment(){
        return new FakeEntertainment();
    }
    public FakeFinance finance(){
        return new FakeFinance();
    }
    public FakeHealth health(){
        return new FakeHealth();
    }
    public FakeInternet internet(){
        return new FakeInternet();
    }
    public FakeJob job(){
        return new FakeJob();
    }
    public FakePersonal personal(){
        return new FakePersonal();
    }
}
