import static org.junit.Assert.*; //imports the JUnit assert api?

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.*; //imports the JUnit lib

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest{
    @Test 
    public void addition() { 
        assertEquals(2, 1 + 1); //test if 2 equals the value of 1+1
    } 

    @Test
    public void testfile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);
        System.out.println("HERE" + test);
        assertEquals(List.of("https://hello.net", "some.html"), test);
    }
} 

