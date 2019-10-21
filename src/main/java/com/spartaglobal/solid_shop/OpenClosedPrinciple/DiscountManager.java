package com.spartaglobal.solid_shop.OpenClosedPrinciple;

public class DiscountManager {

  public void processDiscount(IFilmDiscount iFilmDiscount){
      System.out.println(iFilmDiscount.filmDiscount());
  }


}
