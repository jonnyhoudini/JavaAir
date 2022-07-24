public enum PlaneType {
    Airbus_A320(300, 48000),
    Airbus_Beluga(10, 60000),
    Boeing_Dreamliner(280, 45000),
    Cessna_172(5, 500);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity= capacity;
        this.weight=weight;
    }

    public int getCapacity(){
        return capacity;
    }
    public int getWeight(){
        return weight;
    }


}
