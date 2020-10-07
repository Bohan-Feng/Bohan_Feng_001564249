/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.stream.*;

/**
 *
 * @author Bohan
 */
public class CarList extends ArrayList<Car>{
    

    /**
     * 
     * @return the first avaliable car
     */
    public Car getFirstAvaliabeCar(){
        
        for(Car c : this){
            if(c.isIsAvaliable())
                return c;
        }
        
        return null;
    }
    
    /**
     * 
     * @return the number of avaliable cars
     */
    
    public int getNumOfAvaliableCars(){
        
        return (int)(this.stream().filter(c -> c.isIsAvaliable()).count());
    }
    
    /**
     * 
     * @return the number of unavaliable cars 
     */
    public int getNumOfUnavaliableCars(){
        
        return (int)this.stream().filter(c -> !c.isIsAvaliable()).count();        
    }
    
    
    /**
     * find cars by given maker
     * @param maker name of maker
     * @return carlist that contain cars with given maker
     */
    public CarList getCarsByMaker(String maker){
        
        return this.stream()
        .filter(c -> c.getMaker().equals(maker))
        .collect(Collectors
        .toCollection(CarList::new));
    }
    
    /**
     * find car made in specific year
     * @param year the year the car made
     * @return car list that contain cars with given made year
     */
    public CarList getCarsByYear(int year){
        
        return this.stream()
        .filter(c -> c.getManufactureYear() == year)
        .collect(Collectors
        .toCollection(CarList::new));
    }
    
    /**
     * find car that have specific range of seat numbers
     * @param min min value of seat numbers
     * @param max max value of seat numbers
     * @return car list that contain cars with specific number of seats
     */
    public CarList getCarsBySeats(int min, int max){
        
        return this.stream()
        .filter(c -> c.getSeatNum() >= min && c.getSeatNum() <= max)
        .collect(Collectors
        .toCollection(CarList::new));
    }
    
    
    public Car getCarBySerialNum(String serial){
        
        return (Car) this.stream()
        .filter(c -> c.getSeriesNum().equals(serial))
        .toArray()[0];
    }
    
    
    public CarList getCarsByModel(String model){
        
        return this.stream()
        .filter(c -> c.getModel().equals(model))
        .collect(Collectors
        .toCollection(CarList::new));
    }
    
    public ArrayList<String> getAllMakers(){
        
        return this.stream()
        .map(Car::getMaker)
        .distinct()
        .collect(Collectors
        .toCollection(ArrayList<String>::new));
    }
    
    public Date getLatestUpdate(){
        
        ArrayList<Date> dates = this.stream()
        .map(Car::getUpdateTime)
        .collect(Collectors
        .toCollection(ArrayList<Date>::new));

        return Collections.max(dates);
    }
    
    public CarList getCarsByLocation(String location){
        
        return this.stream()
        .filter(c -> c.getCity().equals(location))
        .collect(Collectors
        .toCollection(CarList::new)));
    }
    
    public CarList getExperiedCars(){
        
        return this.stream()
        .filter(c -> c.getMaintanceExpiredDate().after(new Date()))
        .collect(Collectors
        .toCollection(CarList::new)));
    }
    
    
}
