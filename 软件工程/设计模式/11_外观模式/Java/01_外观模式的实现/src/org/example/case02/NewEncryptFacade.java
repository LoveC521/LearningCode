package org.example.case02;

public class NewEncryptFacade implements AbstractEncryptFacade{
    private final FileReader reader;
    private final NewCipherMachine cipher;
    private final FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        cipher = new NewCipherMachine();
        writer = new FileWriter();
    }

    @Override
    public void fileEncrypt(String filenameSrc, String filenameDes) {
        String plainStr = reader.read(filenameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, filenameDes);
    }
}
