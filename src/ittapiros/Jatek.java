
package ittapiros;

import java.util.Iterator;

/**
 *
 * @author Nami
 */
public class Jatek /*implements Iterable<Jatek>*/{
    private int golyo;
    private int hanyPohar;

    public Jatek(String sor) {
        String[] s=sor.split(";");
        golyo=Integer.parseInt(s[0]);
        hanyPohar=Integer.parseInt(s[0]);
    }

    public int getGolyo() {
        return golyo;
    }

    public int getHanyPohar() {
        return hanyPohar;
    }

//    @Override
//    public Iterator<Jatek> iterator() {
//       String s= "Golyő; Hány pohár/n"+getGolyo()+"; "+getHanyPohar();
//       return this;
//    }
    
    
}
