package com.company;

public class Main {

    public static void main(String[] args) {
      Mons[] mons = Mons.values();
      for (Mons mons1 : mons){
          System.out.println(mons1.name() + " :: " + mons1.ordinal());

      }
      for (int i = 0; i<= mons.length-1; i++){
          Mons mons1 = mons[i];
      }
      System.out.println(mons.length-2);
      System.out.println();
      System.out.println();
      Seson[] sesons = Seson.values();
      for (Seson seson : sesons){
          System.out.println(seson.name()+ " :: "+ seson.ordinal());
      }
        for (int i = 0; i<= sesons.length-1; i++){
            Seson seson = sesons[i];
            System.out.println();
        }

    }
}
