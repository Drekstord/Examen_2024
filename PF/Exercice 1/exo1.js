
const calculerPourboire = (montant, qualite) => {

    const listePourboires = {
    Terrible : 0,
    Poor : 5,
    Good : 10,
    Great : 15,
    Excellent : 20
    };

    if (!(qualite) in listePourboires) {
        return "Rating not recognised";
    }
    
    const pourcentPourboire = qualite / 100 ;
    const pourboire = montant * qualite ;

    return pourboire
}  

console.log(calculerPourboire(20, 20));