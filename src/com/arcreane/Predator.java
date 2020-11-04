package com.arcreane;

public class Predator {
    int m_iAge;
    int m_iSpeed;
    int m_iVigor;
    int m_iLifePoint;

    void move() {

    }

    //Lorsqu'il mange une proie il récupère en point de vie
    //les point de vie de la proie
    void eat(Prey prey) {
        m_iLifePoint += prey.m_iLifePoint;
    }

    void run() {

    }

    void drink() {

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
