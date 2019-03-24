package pl.sda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pmatusiak
 */
public class Parser {

    private Path file = Paths.get("file.csv");

    public void readFile() throws IOException {
        byte[] data = Files.readAllBytes(file);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\\r");
        System.out.println(dataArray.length);


        RealEstate[] realEstate = new RealEstate[dataArray.length];

        double sum = 0;
        for (int i = 0; i < realEstate.length; i++) {

            String[] line = dataArray[i].split(",");

            realEstate[i] = new RealEstate(line[0].trim()
                    , line[1].trim()
                    , Integer.valueOf(line[2].trim())
                    , line[3].trim()
                    , Integer.valueOf(line[4].trim())
                    , Integer.valueOf(line[5].trim())
                    , Integer.valueOf(line[6].trim())
                    , line[7].trim()
                    , line[8].trim()
                    , Integer.valueOf(line[9].trim())
                    , Double.valueOf(line[10].trim())
                    , Double.valueOf(line[11].trim()));

            sum += Integer.valueOf(line[9].trim());
            System.out.println(realEstate[i].toString());
        }
        double avg = sum / realEstate.length;
        System.out.println("\nAverage price: " + avg);
    }

    public List<RealEstate> readFileWithList() throws IOException {
        List<String> data = Files.readAllLines(file);

        int i = 0;

        RealEstate[] realEstates = new RealEstate[data.size()];

        for (String s : data) {
            String[] tab = s.split(",");
            RealEstate realEstate = new RealEstate(tab[0].trim()
                    , tab[1].trim(), Integer.valueOf(tab[2].trim())
                    , tab[3].trim()
                    , Integer.valueOf(tab[4].trim())
                    , Integer.valueOf(tab[5].trim())
                    , Integer.valueOf(tab[6].trim())
                    , tab[7].trim()
                    , tab[8].trim()
                    , Integer.valueOf(tab[9].trim())
                    , Double.valueOf(tab[10].trim())
                    , Double.valueOf(tab[11].trim())
            );
            realEstates[i] = realEstate;
            i++;
        }
        List<RealEstate> realEstateList = Arrays.asList(realEstates);
        return realEstateList;
    }

    public void groupByCity(List<RealEstate> realEstates) {
        //Map<String, List<RealEstate>>
        //klucz to miasto, a lista wartości to nieruchomości w mieście

        Map<String, List<RealEstate>> map = new HashMap<>();

        for (RealEstate estate : realEstates) {
            map.put(estate.getCity(), Arrays.asList(estate));
        }



        //iterować po realEstates
        //klucz - city
        //sprawdzam, czy klucz jest w mapie

        //List<RealEstate> lista = map.get("warszawa");
        //lista
    }
}
