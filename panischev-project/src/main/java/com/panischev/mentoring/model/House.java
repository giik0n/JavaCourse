package com.panischev.mentoring.model;

import java.util.List;
import java.util.Objects;

public class House {
    private String adress;
    private List<String> ownerNames;

    public House(String adress, List<String> ownerNames) {
        this.adress = adress;
        this.ownerNames = ownerNames;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(adress, house.adress) &&
                Objects.equals(ownerNames, house.ownerNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, ownerNames);
    }

    @Override
    public String toString() {
        return "House{" +
                "adress='" + adress + '\'' +
                ", owners=" + ownerNames +
                '}';
    }
}
