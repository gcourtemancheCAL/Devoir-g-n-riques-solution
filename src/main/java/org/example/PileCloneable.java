package org.example;

public class PileCloneable<T extends Cloneable> extends Pile<T>{

    /* Désolé pour numéro, j'avais souvenir qu'utiliser clone était facile. Visiblement, je me suis trompé.
    * Je vous donnes la solution pour la forme, mais ce n'était vraiment pas ce que je voulais que vous
    * ayez a faire. A ce niveau, l'API de java est "brisé".
    *
    * C'est d'ailleurs l'opinion des créateurs de java.
    *
    * Voir : https://www.artima.com/articles/josh-bloch-on-design#part13 */

    @Override
    public PileCloneable<T> clone() {
        PileCloneable<T> c = new PileCloneable<>();

        try{
            for(int i = taille() - 1; i >= 0; i--) {
                T el = get(i);
                T copy = (T)(el.getClass().getMethod("clone").invoke(el));
                pousse(copy);
            }
        }
        catch (Exception e) {

        }

        return c;
    }

}
