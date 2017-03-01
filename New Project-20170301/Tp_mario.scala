/*il a un nombre de vies et une quantité d'argent
(les deux sont des valeurs entières) ;
il peut gagner et perdre de l'argent ;
il peut seulement perdre des vies (pas de mots de passe) ;
il peut battre les ennemis et les boss ;
il peut donner des bisous aux princesses ;
il peut entrer dans un château ;
il peut mourir.*/
class Personnage{
    /*Mario a :
    une chance sur cinq de tomber lors du premier saut ;
    une chance sur trois de tomber dans le deuxième trou :
    une chance sur quatre d'être tué par le premier Goomba ;
    trois chances sur dix de pouvoir entrer dans le château sans qu'il ne soit
    repéré par les gardiens ;
    une chance sur deux de battre Bowser (ça va être dur pour notre petit Mario) ;
    une chance sur trois qu'il soit giflé par Peach (elle est jalouse de Hannah).*/
    
    //début: 10 vies
    var nom : java.lang.String = "Anonyme";
    var vie: Int = 10;
    var money: Int = 0;

}


/*les objets de classe Ennemi doivent être capables de battre seulement
    le personnage principal (qui est une instance de PersonnagePrincipal)*/
class Ennemi{
    
}
/*les objets de classe Boss doivent être capables de battre
le personnage principal et les autres ennemis et boss*/
class Boss{
    
}
/*Les princesses, quant à elles, doivent savoir donner un bisou et
donner une gifle.*/
class Princesse{
    var nom : java.lang.String = "Anonyme";
    def donnerBisou(p: Princesse) = println(nom + " a donné un bisou à " + p.nom)
}


class JourDeMalchance{
    def commencerUnJeu(){
        val mario: Personnage = new Personnage;
        mario.nom="Mario"
        
    }
}
