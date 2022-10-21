import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_2b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        int ribbon = 0;

        for (String g : listOfStrings){
            String [] stringList;

            stringList = g.split("x");

            int l = parseInt(stringList[0]);
            int w = parseInt(stringList[1]);
            int h = parseInt(stringList[2]);

            int bow = l*w*h;

            if(l >= w && l >= h)
                bow += 2*w + 2*h;
            else if(w >= l && w >= h)
                bow += 2*l + 2*h;
            else if(h >= l && h >= w)
                bow += 2*l + 2*w;

            ribbon += bow;
        }
        System.out.println(ribbon);
        }
}