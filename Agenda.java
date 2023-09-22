package com.campusdual.agenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contacto> phoneBook = new HashMap<>();
//    public Agenda(){
//    }

    public Map<String, Contacto> getPhoneBook() {
        return phoneBook;
    }
    public void showPhoneBook(){
        for (Map.Entry<String, Contacto> e : this.getPhoneBook().entrySet()){
            System.out.println("DNI -> " + e.getKey() + "Contacto -> " + e.getValue());
        }
    }
}
