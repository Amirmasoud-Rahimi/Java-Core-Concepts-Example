package garbagecollection;

public class GarbageCollectionTest {
    public static void main(String[] args) {
        GarbageObject garbageObject = new GarbageObject();
        System.gc(); // Garbage Collector is a demon thread
        garbageObject = null;
        System.gc();
    }
}