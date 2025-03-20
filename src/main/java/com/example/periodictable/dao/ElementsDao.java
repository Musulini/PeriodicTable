package com.example.periodictable.dao;

import com.example.periodictable.model.Element;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementsDao {
    List<Element> elementsList;

    public ElementsDao() throws FileNotFoundException {
        elementsList = new ArrayList<>();

        File file = new File("src/main/resources/com/example/periodictable/Elementos.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] element = line.split(", ");
            elementsList.add(createElement(element));

        }
    }

    public Element createElement(String[] elementString) {
        Element element = new Element();
        element.setName(elementString[0]);
        element.setSymbol(elementString[1]);
        element.setAtomicNumber(Integer.parseInt(elementString[2]));
        element.setAtomicMass(Float.parseFloat(elementString[3]));
        element.setAtomicGroup(Integer.parseInt(elementString[4]));
        element.setPeriod(Integer.parseInt(elementString[5]));
        element.setAggregationState(elementString[6]);
        element.setDensity(elementString[7]);
        element.setFusionPoint(elementString[8]);
        element.setBoilingPoint(elementString[9]);
        element.setImage(elementString[10]);
        element.setElectronConfiguration(elementString[11]);
        element.setElectronegativity(Float.parseFloat(elementString[12]));
        element.setValency(Integer.parseInt(elementString[13]));
        element.setAtomicRadius(Integer.parseInt(elementString[14]));
        element.setDiscoverer(elementString[15]);
        element.setDiscoveryYear(elementString[16]);

        return element;
    }

    public Element getElement(int id) {
        return elementsList.get(id-1);
    }

    public List<Element> getAllElements() {
        return elementsList;
    }
}
