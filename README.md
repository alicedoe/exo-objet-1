# exo-objet-1

Objectifs atteinds :
- [x] Pour cet exercice, vous allez utiliser le langage JAVA avec un IDE complet (netbeans, eclipse, code-block, visual studio)
- [x] Utiliser une boucle pour créer le nombre de pieds adéquats. Savoir expliquer pourquoi.
- [x] Comprendre le concept d’objets agrégat d’objets.
- [x] Réaliser Qu’une table est une spécialisation d’un meuble (comme le chien pour l’animal).
- [x] Comprendre qu’on invoque une méthode sur un objet afin d’interagir avec lui.
- [x] On référence l’objet courant grâce au mot clé « this ». ( trouvez les autres mots clés)
- [x] Mettre en évidence qu’une classe est dite abstraite quand on ne peut pas l’instancier directement.
- [x] Comprendre que le constructeur est LA méthode de création de tout objet, invoquée lors de l’utilisation de l’opérateur new. Cette méthode, comme tout autre méthode, peut prendre des paramètres afin « d’affiner » l’initialisation de l’objet.

Objectif à faire :
- Considérer que les pieds, les lattes, les parois, les plateaux etc… sont des « Element ». Un « Meuble » est composé de plusieurs « Element ». Bien sûr, attention pour le calcul de la somme des hauteurs (nombre de pieds, par exemple ;) ).
- Passez la hauteur de l’élément au constructeur de celui-ci.
- Ajoutez de quoi fabriquer une « Armoire », Ajoutez les éléments constitutifs d’une armoire. La hauteur d’une armoire ne se calcule pas de la même manière que pour une table…
- Pour tester il vous suffit de créer plusieurs tables et plusieurs armoires que vous insèrerez dans une liste de meubles (List<Meuble> meubles = new ArrayList() ;). Vous bouclerez sur la liste afin d’afficher la hauteur de chaque meuble.
- Comprenez qui si vous aviez demandé a deux personnes différentes d’implémenter les classe « Table » et « Armoire » ils auraient probablement écris différemment les méthodes « getHauteur() ». Je vous laisse imaginer l’implémentation de la boucle pour afficher les hauteurs. La Super classe Meuble nous oblige à implémenter sa méthode afin de nous assurer de coller à l’utilisation prévue.
- Certains experts auront à l’esprit l’implémentation d’un contrat (Interface de programmation).
