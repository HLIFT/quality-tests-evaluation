# QUESTIONS

**1) A quoi correspond l'acronyme TDD ?**

_L'acronyme TDD veut dire Test Driven Development._

**2) Expliquez-en le principe en quelques mots.**

_Le principe du TDD est de faire des tests sur chaque petit bout de code qui échouent s'il n'a pas le résultat attendu de façon à tester chaque partie.
Cela va permettre de maintenir le code et d'éviter de casser certaines fonctionnalités lors d'une mise à jour par exemple._

**3) Citer 5 types de tests automatisés.**

_Il y a :_
* _Les tests unitaires_
* _Les tests End To End_
* _Les tests de sécurité_
* _Les tests d'intégration_
* _Les tests de charge_

**4) Citez 3 avantages à utiliser des tests automatisés.**

_Les tests automatisés facilitent la maintenance, car nous pouvons vérifier que rien ne casse lors de modifications.
De plus cela permet d'avoir une meilleure qualité de code et ça nous fournit aussi une documentation en même temps._

**5) Citez 3 critères de qualités d'un test automatisé.**

_Un test doit être isolé et donc il doit dépendre le moins possible d'autres morceaux de code.
Celui-ci doit être pertinent et donc tester un morceau de code qui doit être protégé et utile.
Il doit aussi être simple de façon à pouvoir comprendre facilement ce que celui-ci test._

**6) Quel est l'intérêt du principe S.O.L.I.D et à quoi correspondent les lettres qui le composent ?**

_L'acronyme SOLID veut dire :_
* S : _Single responsibility_
* O : _Open / closed_
* L : _Liskov substitution_
* I : _Interface segregation_
* D : _Dependency inversion_

_L'intérêt de ce principe-là est de développer de meilleures architectures logicielles qui seront plus facile à comprendre, plus souples et qui permettent une meilleure maintenabilité._

**7) Expliquez plus en détail l'intérêt et les pratiques derrière une des lettres du principe S.O.L.I.D.**

_Pour la Single Repsonsability cela veut dire que chaque classe, méthode ou bien fonction doit avoir une seule et même responsabilité et donc ne doit pas faire plusieurs choses._

**8) Citez 5 types de tests automatisés définis dans la norme ISO 25010 et quelques critères de qualité associés à deux de ces tests.**

_Il y a :_

* _Les tests fonctionnels_ 
* _Les tests de fiabilité_
* _Les tests de sécurité_
* _Les tests de maintenabilité_
* _Les tests de performance_

_Pour les tests de performance les critères de qualité sont :_

* _L'utilisation de la resource_
* _Le temps de réponse_
* _La charge (capacité)_

**9) Qu'est ce que le polymorphisme ? Vous pouvez vous appuyer sur un exemple pour expliquer.**

_Le polymorphisme est le fait qu'une méthode d'une classe mère peut être définie de manière différente pour chaque classe fille._

_Exemple d'une classe Animale qui a une méthode crier :_

```kotlin
class Animal {
    fun crier(): String
}

class Cat: Animal {
    override fun crier(): String {
        return 'Meow'
    }
}

class Dog: Animal {
    override fun crier(): String {
        return 'Woof'
    }
}
```

# PROJET - Rapport d'employés
Vous mettez en place un système de gestion des employés dans une boutique. Le gérant de la boutique souhaite pouvoir
ouvrir son magasin le Dimanche, mais la loi n'autorise pas les mineurs (age < 18 ans) à travailler ce jour.
On vous demande d'implémenter un programme qui facilitera l'organisation de l'équipe dans le magasin.

Votre programme sera évalué selon la qualité du code et des tests, leur pertinence, la couveture du code, la gestion des
exceptions, etc.
Vous êtes autorisés à modifier la visibilités des propriétés de la classe `Employee`, ou, mieux, à implémenter toutes
les fonctions nécessaires dans cette classe.

User stories à implémenter :
- En tant que gérant de la boutique, je souhaite pouvoir obtenir la liste des employés majeurs, afin de savoir qui sera
disponible le dimanche.
- En tant que gérant de la boutique, je veux pouvoir lister les employés par ordre alphabétique de leur nom, afin de les
retrouver plus facilement.
- En tant que gérant de la boutique, je veux obtenir la liste en majuscules des noms des employés afin de lire plus facilement.
- En tant que gérant de la boutique, je veux pouvoir trier les employés par ordre descendant plutôt qu'ascendant des noms
des employés.
- En tant que gérant, je veux pouvoir obtenir la liste des employés compris entre deux ages afin de grouper des équipes
par affinités.
- En tant que gérant, je veux pouvoir saisir le début d'un nom et obtenir la liste des employés dont le nom commence par
ce préfixe.