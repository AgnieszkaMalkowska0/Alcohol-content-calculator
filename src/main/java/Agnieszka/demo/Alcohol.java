package Agnieszka.demo;



public enum Alcohol {



    BEER(0.05),

        VODKA(0.4),

        WINE(0.112),

        HOOCH(0.56);



private double alcContent;



        Alcohol(double alcContent) {

        this.alcContent = alcContent;

        }



public double getAlcContent() {

        return alcContent;

        }



public void setAlcContent(double alcContent) {

        this.alcContent = alcContent;

        }

        }
