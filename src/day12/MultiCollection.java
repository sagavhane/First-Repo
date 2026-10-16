
package day12;

import java.util.ArrayList;
import java.util.List;

public class MultiCollection {

    public static void main(String[] args) {

        List<String> mh = new ArrayList<>();
        mh.add("mumbai");
        mh.add("Solapur");
        mh.add("Pune");
        
        
        List<String> rj = new ArrayList<>();
        mh.add("Jaipur");
        mh.add("Bikaner");
        mh.add("Kota");
        
        
        List<List<String>> India = new ArrayList();
        India.add(mh);

        India.add(rj);
        
        System.out.println(India.get(0).get(2));
        
        

    }

}