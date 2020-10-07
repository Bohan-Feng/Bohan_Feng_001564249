/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        
        return new Car();
    }
    
    
    public CarList getCarsByModel(String model){
        
        return new CarList();
    }
    
    public ArrayList<String> getAllMakers(){
        
        return new ArrayList<String>();
    }
    
    public Date getLatestUpdate(){
        
        return new Date();
    }
    
    public CarList getCarsByLocation(String location){
        
        return new CarList();
    }
    
    public CarList getExperiedCars(){
        
        return new CarList();
    }
    
    
}
