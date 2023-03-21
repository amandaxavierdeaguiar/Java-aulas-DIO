package CollectionsMap.src;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map.EntrySet;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;


/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

public class ConsumoCarro {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        final Map<String, Double> carrosPopulares = new HashMap<>(){{
            put ("gol", 14.4);
            put ("uno", 15.6);
            put ("mobi", 16.1);
            put ("hb20", 14.5);
            put ("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        /*
        System.out.println("Confira o terceiro modelo adicionado");
        Não tem um método que mostre
        */

        System.out.println("Exiba os modelos " + carrosPopulares.keySet());

        System.out.println("Exiba os consumos do carro: " + carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo"); //carro que tem maior valor de km/L
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo"); //carro que tem com menor valor de km/L
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos Eficiente e seu respectivo consumo: "+ modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Soma os consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator(); //retorno dos carros Populares é um Collections
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Média dos consumos dos carros listados:" + (soma/carrosPopulares.size()));

        
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros de acordo com a ordem que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap(){{
            put ("gol", 14.4);
            put ("uno", 15.6);
            put ("mobi", 16.1);
            put ("hb20", 14.5);
            put ("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());
        
        System.out.println("Exiba o dicionário ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros");
        carrosPopulares.clear();

        System.out.println("O dicionario está vazio? " + carrosPopulares.isEmpty());
    }
}