class GarbageCollectionExample{
    // Finalize method to observe garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed on object: " + this);
    }

    public static void main(String[] args) {
        // Creating objects
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        // Nullifying references (eligible for GC)
        obj1 = null;
        obj2 = null;

        // Requesting Garbage Collection
        System.gc();

        // Waiting to see the finalize() execution
        try {
            Thread.sleep(1000); // Delay to ensure GC runs before program exits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}


