package kædet_struktur.train;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListTrain2{
    private WagonNode lastWagon;
    private WagonNode firstWagon;

    /**
     * Constructs an empty double linked list train.
     */
    public LinkedListTrain2() {
        this.lastWagon = null;
        this.firstWagon = null;
    }

    public void addNode(WagonNode wagon){
        WagonNode node = wagon;

        // Hvis vore liste er tom

    }


    /**
     * Adds a wagon node to the end of the double linked list train.
     *
     * @param wagon the wagon node to add
     */
//    public void addLast(WagonNode wagon) {
//
//        WagonNode currentWagon = getFirstWagon();
//        boolean done = false;
//
//        while (currentWagon.getNextWagon() != null && !done) {
//
//            currentWagon = currentWagon.getNextWagon();
//
//            if (currentWagon.getNextWagon() == null) {
//                wagon.setPreviousWagon(currentWagon);
//                wagon.setNextWagon(null);
//                currentWagon.setNextWagon(wagon);
//                done = true;
//            }
//
//        }
//
//    }

    /**
     * Returns the last wagon node in the double linked list train.
     *
     * @return the last wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getLast() {
        if (this.lastWagon == null) {
            throw new NoSuchElementException();
        }
        return this.lastWagon;
    }


//    public void addLast(WagonNode wagon)
//    {
//        System.out.println(count());
//        insertAt(wagon, count());
//    }


}
