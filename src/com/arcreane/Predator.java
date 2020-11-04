package com.arcreane;

public class Predator {
    private int m_iAge;
    private int m_iSpeed;
    private int m_iVigor;
    private int m_iLifePoint;

    void move() {

    }

    //Lorsqu'il mange une proie il récupère en point de vie
    //les point de vie de la proie
    void eat(Prey prey) {
        m_iLifePoint += prey.m_iLifePoint;
    }

    void run() {

    }

    //Methode pour permettre à l'animal de boire
    void drink(WaterSpot p_WaterSpot) {
        //Quantité d'eau qu'il souhaite boire, mais il faut demander à la waterspot
        //si il peut effectivement boire autant d'eau que ca
        int waterWanted = (int)(Math.random()*250);
        //Ici l'utilisation des getter / setter simple n'est pas suffisant car
        //il peut y avoir un probleme de quantité accessible
        // il va donc falloir ajouter une méthode supplémentaire dans waterspot
        //pour lui demander la quantité qu'il peut boire par rapport à la quantité d'eau
        //qu'il désire
        //int tmp = p_WaterSpot.getTotalWaterQuantity() - waterDrunk;
        //p_WaterSpot.setTotalWaterQuantity(tmp);
        int waterDrunk = p_WaterSpot.drink(waterWanted);
        m_iLifePoint += waterDrunk;
    }

    //La méthode hunt permet au prédateur de trouver la premiere proie
    //non nulle du tableau et de la bouffer
    //Pour le moment les coordonnées sur le terrain ne sont pas prise en compte
    //(ni meme conceptualisées) donc la notion d'espacement et donc est ce qu'il peut
    //la bouffer réellement n'est pas encore prise en compte
    void hunt(Prey[] preys) {
        for (int i = 0; i < preys.length; i++) {
            if (preys[i] != null) {
                eat(preys[i]);
                //On déréférencie l'espace mémoire pour que le garbage collector puisse
                //supprimer la variable qui était contenu dans le tableau
                preys[i] = null;
                //Quand il mange une proie il arrete de chasser
                break;
            }
        }
    }

    void reproduce() {

    }

    void rest() {

    }

}
