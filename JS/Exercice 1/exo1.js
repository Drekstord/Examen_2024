
const calculer_pourboire = (montant, qualite) => {

    const liste_pourboires = {
    Terrible : 0,
    Poor : 5,
    Good : 10,
    Great : 15,
    Excellent : 20
    };

    if (!(qualite) in liste_pourboires) {
        return "Rating not recognised";
    }
    
    const pourcent_pourboire = qualite / 100 ;
    const pourboire = montant * qualite ;

    return pourboire
}  

console.log(calculer_pourboire(20, 20));