package org.example;
public class Main {
    public static void main(String[] args) {
        Provider provider=new Provider.Builder("Олег Курченко","0504918453")
                .build();
    }
    System.out.println(provider);
}


}