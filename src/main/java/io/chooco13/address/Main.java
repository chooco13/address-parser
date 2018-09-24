package io.chooco13.address;

import io.chooco13.address.domain.Address;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File directory = new File("jibun");

        if (directory.listFiles() != null) {
            int total = 0;

            for (File file : directory.listFiles()) {
                List<Address> addressList = new ArrayList<Address>();

                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));

                    String line;
                    while ((line = in.readLine()) != null) {
                        String[] splits = line.split("\\|");
                        Address address = new Address(splits[1], splits[2], splits[3]);
                        if (!addressList.contains(address)) {
                            addressList.add(address);
                        }
                    }
                    in.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

                System.out.println("addressList.size()::" + addressList.size());
                total += addressList.size();
                for (Address address : addressList) {
                    System.out.println(address.getDesc());
                }
            }

            System.out.println("total::" + total);
        }
    }
}
