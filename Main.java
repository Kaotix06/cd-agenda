package com.campusdual.agenda;


public class Main {

    public static void main(String[] args) {
        Agenda ag = new Agenda();
        Contacto ctc1 = new Contacto ("Fabricio", "Figeroa", "Maracaibo", 36720, "11223344A");
        Contacto ctc2 = new Contacto("Pedro", "Picapiedra", "Rocapolis", 963852, "22334455B");
        Contacto ctc3 = new Contacto("Pablo", "Marmol", "Rocapolis", 333666, "33445566C");

        ctc1.addNumber("986112233");
        ctc1.addNumber("986223344");
        ctc2.addNumber("622619717");
        ctc2.addNumber("911132017");
        ctc3.addNumber("234234234");
        ctc3.addNumber("567567567");

//        ctc2.phoneCall(ctc3);
        ag.getPhoneBook().put(ctc1.getDni(), ctc1);
        ag.getPhoneBook().put(ctc2.getDni(), ctc2);
        ag.getPhoneBook().put(ctc3.getDni(), ctc3);
//        ag.getPhoneBook().get("22334455B").phoneCall(ag.getPhoneBook().get("334455566C"));
        Contacto ctc20 = ag.getPhoneBook().get("22334455B");
        Contacto ctc40 = ag.getPhoneBook().get("334455566C");
//        ctc20.phoneCall(ctc40);


        ag.showPhoneBook();
    }
}