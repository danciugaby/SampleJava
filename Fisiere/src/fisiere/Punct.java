/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisiere;


public class Punct implements Comparable<Punct>
{
    double distance(Punct a, Punct b)
    {
        return Math.sqrt( Math.pow(a.x - b.x,2.0) + 
                Math.pow(a.y - b.y,2.0) 
                +Math.pow(a.z - b.z,2.0));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 14 * hash + this.x;
        hash = 47 * hash + this.y;
        hash = 23 * hash + this.z;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punct other = (Punct) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.z != other.z) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Punct o) {
        Punct origine = new Punct(0, 0, 0);
        if (distance(this,origine) > distance(o,origine))
            return 1;
        else if (distance(this,origine) < distance(o,origine))
            return -1;
        else
            return 0;
    }
    int x,y,z;

    public Punct(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punct{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    public String Write()
    {
        return x + "," + y + "," + z;
    }
}
