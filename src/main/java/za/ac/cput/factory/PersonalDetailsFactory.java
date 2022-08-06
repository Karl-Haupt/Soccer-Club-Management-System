/*
Student Name: Trevor Ngcobo
Student Number: 220477019
Subject: Applications Development Practice 3
Assessment: Assignment 1
Group: 18
 */

package za.ac.cput.factory;

import za.ac.cput.domain.club.ContactInformation;
import za.ac.cput.domain.PersonalDetails;

import java.time.LocalDate;

public class PersonalDetailsFactory
{

    public static PersonalDetails createPersonalDetails(String id, String name, String surname, LocalDate dOb, ContactInformation contactDetails)
    {
//        if(Helper.isNullOrEmpty(id))
//        {
//            return null;
//        }
//        else
        return new PersonalDetails.Builder()
                .setIdNumber(id)
                .setFirstName(name)
                .setSurname(surname)
                .setDateOfBirth(dOb)
                .setContactDetails(contactDetails)
                .build();
    }

}
