package com.company;

import java.io.File;

public class ScanFile {
    private String template;

    public ScanFile(String template) {
        this.template = template;
    }

    public void scanFileByTemplate(File directory) {
        if (directory.isDirectory()) {
            for (File content : directory.listFiles()) {
                if (content.getName().contains(template)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }
}
