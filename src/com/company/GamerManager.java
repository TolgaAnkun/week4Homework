package com.company;

public class GamerManager implements GamerServices {
    ValidatorManager validatorManager;

    public GamerManager(ValidatorManager validatorManager) {
        this.validatorManager = validatorManager;
    }


    @Override
    public void add(Gamer gamer) {
        if (gamer.getFirstName() != null && gamer.getLastName() !=null && gamer.getNationalIdentityNumber().length() ==11
        && gamer.getDateOfBirth() <= 1990){
            System.out.println(gamer.getNickName() + " Kaydınız yapılan kontrollerden sonra başarı ile oluşuturulmuştur.");
        }else{
            System.out.println("Yapılan kontrollerde eksik veya hatalı bilgiler bulunmaktadır. Lütfen kontrol ediniz.");
        }
    }

    @Override
    public void update(Gamer gamer) {
        if (gamer.getFirstName() != null && gamer.getLastName() !=null && gamer.getNationalIdentityNumber().length() ==11
                && gamer.getDateOfBirth() >= 1990){
            System.out.println(gamer.getNickName() + " Kaydınız yapılan kontrollerden sonra başarı ile güncellenmiştir.");
        }else{
            System.out.println("Yapılan kontrollerde eksik veya hatalı bilgiler bulunmaktadır. Lütfen kontrol ediniz.");
        }
    }



    @Override
    public void delete(Gamer gamer) {
        if (gamer.getFirstName() != null && gamer.getLastName() !=null && gamer.getNationalIdentityNumber().length() ==11
                && gamer.getDateOfBirth() >= 1990){
            System.out.println(gamer.getNickName() + " Kaydınız yapılan kontrollerden sonra başarı ile silinmiştir.");
        }else{
            System.out.println("Yapılan kontrollerde eksik veya hatalı bilgiler bulunmaktadır. Lütfen kontrol ediniz.");
        }
    }

    }

