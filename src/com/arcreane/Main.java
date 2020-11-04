package com.arcreane;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //On prépare l'accueil de 100 prédateurs et 100 proies
        Predator[] preds = new Predator[100];
        Prey[] preys = new Prey[100];
        //On instancie tous nos prédateur et nos proies et on les
        //stock dans nos tableaux prévus à cet effet
        for (int i = 0; i < preds.length; i++) {
            preds[i] = new Predator();
            preys[i] = new Prey();
        }

        //On invite le premier prédateur à chasser parmi toutes les proies
        //disponibles
        Prey premiereProie = preys[0];
        preds[0].hunt(preys);
        preds[1].hunt(preys);
        preds[2].hunt(preys);
        premiereProie = null;
    }
}
