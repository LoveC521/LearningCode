package org.example.case02;

public class Main {
    public static void main(String[] args) {
        AbstractEncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src", "des");
    }
}
