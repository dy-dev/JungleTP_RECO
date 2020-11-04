package com.arcreane;

public class Terrain {
    WaterSpot m_WaterSpot;
    Prey[] m_PreyArray;
    Predator[] m_PredatorArray;
    Plant[] m_PlantArray;

    public boolean m_bHasStillLivingCreature;
    //Je demande à ce qu'on m'indique le nombre d'éléments dans mes tableaux
    //lors de la construction de mon terrain
    public Terrain(int p_iNbElements) {
        //On prépare l'accueil de 100 prédateurs et 100 proies
        m_PredatorArray = new Predator[p_iNbElements];
        m_PreyArray = new Prey[p_iNbElements];
        m_PlantArray = new Plant[p_iNbElements];
        m_WaterSpot = new WaterSpot();

        //On instancie tous nos prédateur et nos proies et on les
        //stock dans nos tableaux prévus à cet effet
        for (int i = 0; i < p_iNbElements; i++) {
            m_PredatorArray[i] = new Predator();
            m_PreyArray[i] = new Prey();
            m_PlantArray[i] = new Plant();
        }
//
//        //On invite le premier prédateur à chasser parmi toutes les proies
//        //disponibles
//        Prey premiereProie = preys[0];
//        preds[0].hunt(preys);
//        preds[1].hunt(preys);
//        preds[2].hunt(preys);
//        premiereProie = null;

        for (int i = 0; i < p_iNbElements; i++) {
            m_PredatorArray[i].drink(m_WaterSpot);
            m_PreyArray[i].drink(m_WaterSpot);
        }
    }

    public void step() {
        for (Predator p : m_PredatorArray) {
            p.step();
        }

    }

    //Methode pour simuler la pluie qui va reremplir le plan d'eau
    public void rain(int p_iQuantityWaterRained) {
        //Méthode appelée sur le plan d'eau pour lui signaler qu'il a plu
        //et qu'il y a donc de l'eau qui a rerempli le bassin
        m_WaterSpot.refill(p_iQuantityWaterRained);
    }
}
