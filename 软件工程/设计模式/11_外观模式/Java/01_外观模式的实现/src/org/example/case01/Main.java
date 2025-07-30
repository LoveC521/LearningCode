package org.example.case01;

public class Main {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src", "des");
    }
}
