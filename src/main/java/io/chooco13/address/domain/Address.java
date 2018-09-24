package io.chooco13.address.domain;

import lombok.Data;

@Data
public class Address {
    private int id;

    private String local1;

    private String local2;

    private String local3;

    private String desc;

    public Address() {
    }

    public Address(String local1, String local2, String local3) {
        this.local1 = local1;
        this.local2 = local2;
        this.local3 = local3;
        this.desc = String.format("%s %s %s", local1, local2, local3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;

        Address address = (Address) o;

        return desc != null ? desc.equals(address.desc) : address.desc == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }
}
