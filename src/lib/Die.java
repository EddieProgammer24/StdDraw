package edu.wiu.cs250;
import java.util.Random;
/*
   @author Jason Covert
   CS250 Spring 2024
   version 2.0
*/
public class Die implements Comparable<Die>{
   private int currentValue;
   private static Random rand = new Random();
   public Die(){
      roll();
   }
   public Die( int v ){
      if( v < 1 || v > 6 )
         throw new IllegalArgumentException("v must be between 1 and 6");
      currentValue = v;
   }
   public int getValue(){ return currentValue; }
   public void roll(){ currentValue = rand.nextInt(6) + 1; }
   public String toString(){
      return "Die: " + currentValue;
   }
   public int compareTo( Die d ){
      return this.currentValue - d.currentValue;
   }
   
}