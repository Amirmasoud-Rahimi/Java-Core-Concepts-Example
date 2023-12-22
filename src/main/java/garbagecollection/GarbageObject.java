package garbagecollection;

public class GarbageObject {
    @Override
    protected void finalize() {
        //perform cleanup processing -> close connection or files -> close resource except objects
        System.out.println("Object is garbage collected");
    }
}