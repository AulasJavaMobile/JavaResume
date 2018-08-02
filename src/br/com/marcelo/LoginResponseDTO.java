package br.com.marcelo;

import java.io.Serializable;

/*
        {
          "name": "Marcelo",
          "age": "39",
          "premium": "true"
         }

         //base URL
         https://myaplication.mydomin.com.br

         /  -->path
         /auth GET

         charset type: application/json
         RESt and Soap

 */
public class LoginResponseDTO implements Serializable {

    private String name;
    private int age;
    private boolean premium;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
