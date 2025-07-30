package org.example.case01;

public class EncryptFacade {
    private final FileReader reader;
    private final CipherMachine cipher;
    private final FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String filenameSrc, String filenameDes) {
        String plainStr = reader.read(filenameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, filenameDes);
    }
}
