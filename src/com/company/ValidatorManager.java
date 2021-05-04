package com.company;

public class ValidatorManager implements Validator{
    @Override
    public boolean isValidUser_GamerFirstName(Gamer _gamer) {
        if(_gamer.getFirstName() != null){

            return true;
        }else {

            return false;
        }
    }

    @Override
    public boolean isValidUser_GamerLastName(Gamer _gamer) {
        if(_gamer.getLastName() != null){

            return true;
        }else {

            return false;
        }


    }

    @Override
    public boolean isValidUser_GamerNationalIdentityNumber(Gamer _gamer) {
        if(_gamer.getNationalIdentityNumber().length() == 11){

            return true;

        }else{

            return false;
        }
    }

    @Override
    public boolean isValidUser_GamerDateOfBirth(Gamer _gamer) {
        if (_gamer.getDateOfBirth() >= 1990) {

            return true;
        }else{

            return false;
        }
    }
}

