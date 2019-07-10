package Agnieszka.demo;



import Agnieszka.demo.Alcohol;
import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;





@NoArgsConstructor

@Data

public class AlcoholCounter {



    private static final float FactorWomen = 0.6f;



    private static final float FactorMen = 0.7f;



    private static final int burningAlcoholForMenAnHour = 11;

    private static final int burningAlcoholForWomenAnHour = 9;





    public float calculatePerMil(double quantity, double weight,

                                 boolean male, Alcohol alcohol) {

        float proMil = 0;

        if (male) {

            proMil = (float) ((float) quantity / FactorMen / weight * alcohol.getAlcContent());

        } else {

            proMil = (float) ((float) quantity / FactorWomen / weight * alcohol.getAlcContent());

        }

        return proMil;

    }



    public float calculatePermilWithHours(double quantity, double weight, boolean male, double hours, Alcohol alcohol) {

        float proMil = 0;

        if (male) {

            proMil = (float) ((float) ((quantity * alcohol.getAlcContent()) - burningAlcoholForMenAnHour * hours) / (FactorMen* weight));

        } else {

            proMil = (float) ((float) ((quantity * alcohol.getAlcContent()) - burningAlcoholForWomenAnHour * hours) / (FactorWomen * weight));

        }

        return proMil;

    }







}



