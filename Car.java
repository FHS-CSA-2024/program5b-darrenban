public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    
    public Car(String myCarName, double myMilesDriven, double myGallonsUsed){
        carName = myCarName;
        milesDriven = myMilesDriven;
        gallonsUsed = myGallonsUsed;
    }
    
    public String getCarName(){
        return carName;
    }
    
    public double myMilesDriven(){
        return milesDriven;
    }
    
    public double myGallonsUsed(){
        return gallonsUsed;
    }
    
    public void setCarName(String myCarName){
        carName = myCarName;
    }
    
    public void setMilesDriven(double myMilesDriven){
        milesDriven = myMilesDriven;
    }
    
    public void setGallonsUsed(double myGallonsUsed){
        gallonsUsed = myGallonsUsed;
    }
    
    public double calculateAverage(){
        double output;
        output = Math.round(10.0 * milesDriven / gallonsUsed) / 10.0;
        return output;     
    }
    
    public String toString(){
        String output = "";
        output = carName + " averaged " + calculateAverage() + " m/g";
        return output;
    }
    
    
    
}

