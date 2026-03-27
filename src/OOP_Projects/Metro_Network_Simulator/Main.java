package OOP_Projects.Metro_Network_Simulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main() {

        MetroNetwork mn = new MetroNetwork();

        Station s1 = new Station("Times Square");
        Station s2 = new Station("Grand Central");
        Station s3 = new Station("Union Square");

        List<Station> list1 = new ArrayList<>(Arrays.asList(s1, s2, s3));
        Line line1 = new Line("Blue", list1);

//        System.out.println(line1);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        mn.addNewLine(line1);
        System.out.println(mn);


    }
}
