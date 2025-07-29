package org.example.case02;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private final ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
