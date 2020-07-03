package com.company.enums;

public enum Payday {
    blueCollarsPayday(10)
    , whiteCollarPayday (5)
    , menagementPayday(2);

    private final int payday;

    Payday(int payday) {
        this.payday = payday;

    }

    public int getPayday() {
        return payday;
    }
}

