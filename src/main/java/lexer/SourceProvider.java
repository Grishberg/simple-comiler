package lexer;

import java.io.IOException;

public interface SourceProvider {
    char readChar() throws IOException;
}
