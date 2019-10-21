package com.spartaglobal.solid_shop;

import com.spartaglobal.solid_shop.OpenClosedPrinciple.DiscountManager;
import com.spartaglobal.solid_shop.OpenClosedPrinciple.FantasyFilmDiscount;
import com.spartaglobal.solid_shop.Students.ManageStudents;
import com.spartaglobal.solid_shop.Students.Student;
import com.spartaglobal.solid_shop.SubstitionExample.PrintFilm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // FantasyFilmDiscount fantasyFilmDiscount = new FantasyFilmDiscount();
        //fantasyFilmDiscount.setDiscount("20%");
        //DiscountManager discountManager = new DiscountManager();
        //discountManager.processDiscount(fantasyFilmDiscount);

        Student Sham = new Student("Shmaila", "Rehman", "JAVA SDET");
        ManageStudents manageStudents = new ManageStudents();
        manageStudents.printName(Sham.getFirstName(),Sham.getLastName());
    }
}
