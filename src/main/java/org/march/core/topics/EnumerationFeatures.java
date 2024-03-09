package org.march.core.topics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationFeatures {

    public static void main(String[] args) {
        Collection<Integer> collection = new Vector<Integer>();
        Integer[] i = {1,2,3,4,5,6,7,8,9};
        collection.addAll(Arrays.asList(i));

        /*Thread modifyingThread = new Thread(()->{
            for(int j=10;j<=15;j++){
                collection.add(j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });*/
//    modifyingThread.start();
        Enumeration<Integer> enumer = ((Vector<Integer>)collection).elements();
        while(enumer.hasMoreElements()){
            Integer value = enumer.nextElement();
            System.out.println("Before Remove"+value);
            if(value%2 == 0){
                collection.remove(value);
            }
            System.out.println("List Value "+value);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
