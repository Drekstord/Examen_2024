const motLePlusLong = (phrase) => {

    return phrase.split(" ").reduce((x, y) => {
        return y.length >= x.length ? y : x;
    }, "");

};

console.log(motLePlusLong('a b c d e fgh'));
console.log(motLePlusLong('one two three'));
console.log(motLePlusLong('red blue grey'));
console.log(motLePlusLong("J'ai envie d'essayer aevc une phrase bien plus longue que le mot anticonsitutionnellement, en partant du principe qu'il n'y ait pas de faute "))