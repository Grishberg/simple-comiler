package main;

import lexer.SourceProvider;

import java.io.IOException;

public class SystemSourceProvider implements SourceProvider {
    @Override
    public char readChar() throws IOException {
        return (char) System.in.read();
    }
}
