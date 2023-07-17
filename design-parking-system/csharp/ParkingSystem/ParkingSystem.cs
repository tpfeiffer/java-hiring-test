// Hello World! program
namespace ParkingSystem
{
    class ParkingSystem
    {
        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small)
        {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        private bool AddCar(int v)
        {
            return true;
        }

        static void Main(string[] args)
        {

            ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

            System.Console.WriteLine("Pass test 1: " + (parkingSystem.AddCar(1) == true));
            System.Console.WriteLine("Pass test 2: " + (parkingSystem.AddCar(2) == true));
            System.Console.WriteLine("Pass test 3: " + (parkingSystem.AddCar(3) == false));
            System.Console.WriteLine("Pass test 4: " + (parkingSystem.AddCar(1) == false));

        }


    }
}