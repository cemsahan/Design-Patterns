public class Television implements ElectronicDevice {

    private int volume=0;


        @Override
        public void volumeUp() {

            volume++;
            System.out.println("Tv Volume is at: "+ volume);    
        
        }
      
                @Override
        public void volumeDown() {

            volume--;
            System.out.println("Tv Volume is at: "+ volume);    

        }
       
        @Override
        public void off() {
            
            System.out.println("Tv is OFF");    
            
        }
      
        @Override
        public void on() {
           
            System.out.println("Tv is ON");    
            
        }



}