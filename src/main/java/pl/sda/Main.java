package pl.sda;

import java.io.IOException;

/**
 * @author pmatusiak
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
//        parser.readFile();
//        parser.readFileWithList();
        parser.groupByCity(parser.readFileWithList());
    }

}
