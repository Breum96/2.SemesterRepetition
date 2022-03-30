package kædet_struktur.train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;
    private int count;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {
        if(firstWagon == null){
            firstWagon = wagon;
        }else{
            wagon.setNextWagon(firstWagon);
            firstWagon = wagon;
        }
        count++;

//        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst()
    {
        if (firstWagon == null){
            throw new NoSuchElementException();
        }else{
            WagonNode temp = firstWagon;
            firstWagon = firstWagon.getNextWagon();
            count--;
            return temp;
        }


//        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count()
    {
        return count;

//        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        WagonNode temp = firstWagon;
        boolean done = false;
        if (firstWagon == wagon){
            firstWagon = firstWagon.getNextWagon();
            count--;
            return true;
        }
        while(done == false){
            if (temp.getNextWagon() == null){
                done = true;
            }
            if (temp.getNextWagon() == wagon){
                temp.setNextWagon(wagon.getNextWagon());
                count--;
                return true;
            }else{
                temp = temp.getNextWagon();
            }

        }
        return false;

//        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        WagonNode currentWagon = firstWagon;
        if (position == 0){
            addFirst(wagon);
        } else{
            for (int i = 0; i < position -1 ; i++) {
                currentWagon = currentWagon.getNextWagon();
            }
            WagonNode temp = currentWagon.getNextWagon();
            currentWagon.setNextWagon(wagon);
            currentWagon.getNextWagon().setNextWagon(temp);

        }

//        throw new UnsupportedOperationException("Not implemented");
    }
}
