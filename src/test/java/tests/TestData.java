package tests;

import utils.RandomUtils;


public class TestData {

           RandomUtils randomUtils = new RandomUtils();
           String firstName = randomUtils.setFirstName(),
                   lastName = randomUtils.setLastName(),
                    fullName = firstName + " " + lastName,
                    email = randomUtils.setEmail(),
                    gender = randomUtils.setGender(),
                   phoneNumber = randomUtils.setPhoneNumber(),
                    day = randomUtils.setDay(),
                    month = randomUtils.setMonth(),
                    year = randomUtils.setYear(),
                    dateBirth = day + " " + month + "," + year,
                    picture = randomUtils.setPicture(),
                    fullAddress = randomUtils.setFullAddress(),
                    subjects = randomUtils.setSubjects(),
                    hobbies = randomUtils.setHobbies(),
                   state = randomUtils.getRandomState(),
                    city = randomUtils.getRandomCity(state);
}
