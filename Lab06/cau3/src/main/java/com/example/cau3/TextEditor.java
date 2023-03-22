package com.example.cau3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
    private String text;
    private TextWriter writer;

    @Autowired
    public TextEditor(@Qualifier("plainTextWriter") TextWriter writer) 
    {
        this.writer = writer;
    }

    public void save() 
    {
        writer.write("test.txt", this.text);
    }

    public void input(String text) 
    {
        this.text = text;
    }
}
