package com.example.taras.personalwork;

/**
 * Created by Taras on 01.12.2016.
 */
//Характеристика дома с поля ми улица, количество жельцов и характеристикой сдания
public class House {
    private String street;
    private int countOfPeople;


    public House(String street, int countOfPeople) {
        this.street = street;
        this.countOfPeople = countOfPeople;
    }
    public House() {}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (countOfPeople != house.countOfPeople) return false;
        return street != null ? street.equals(house.street) : house.street == null;

    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + countOfPeople;
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", countOfPeople=" + countOfPeople +
                '}';
    }
}
