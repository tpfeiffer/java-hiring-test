class ParkingSystem {

    public ParkingSystem(int big, int medium, int small) {
        
    }
    
    public boolean addCar(int carType) {
        
        return true;
        
    }
    
    
    public static void main(String[] args) {
        
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        
        System.out.println("Pass test 1: " + String.valueOf(parkingSystem.addCar(1) == true));
        System.out.println("Pass test 2: " + String.valueOf(parkingSystem.addCar(2) == true));
        System.out.println("Pass test 3: " + String.valueOf(parkingSystem.addCar(3) == false));
        System.out.println("Pass test 4: " + String.valueOf(parkingSystem.addCar(1) == false));
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */