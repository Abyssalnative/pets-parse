package com.testing.boot.velocity.parser.model;

import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List<String> favFoods;
    private String birthYear;
    private String photo;

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getFavFoods() {
        return favFoods;
    }

    public void setFavFoods(List<String> favFoods) {
        this.favFoods = favFoods;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
