package com.company.as.web.productprice;

import au.com.bytecode.opencsv.CSVReader;
import com.google.common.collect.MinMaxPriorityQueue;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;


import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductPriceBrowse extends AbstractLookup {


    public void onImport(Component source) throws IOException {
        File dir = new File(System.getProperty("user.home")+"/Downloads/1");
        File[] files = dir.listFiles();
        for (File file:files)
        {
            if(file.getPath().contains(".csv")) {
                CSVReader reader = new CSVReader(new FileReader(file.getPath()), ';');
                String[] nextLine;
                int counter =0;
                String brand;
                String code;
                String name;
                String alias;
                Double multiplicity;
                while ((nextLine = reader.readNext()) != null) {
                    if(nextLine!=null) {
                        brand = nextLine[0];
                        code = nextLine[1];
                        name = nextLine[2];
                        alias = nextLine[6];
                        multiplicity = Double.valueOf(nextLine[7]);
                    }
                }
                showNotification("Country [code= " + counter +  "]");
            }
//            file.delete();

        }
    }
}