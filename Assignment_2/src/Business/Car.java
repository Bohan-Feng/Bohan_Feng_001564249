/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Bohan
 */
public class Car {
    private boolean isAvaliable;
    private String maker;
    private int manufactureYear;
    private int seatNum;
    private String SeriesNum;
    private String model;
    private String city;
    private Date updateTime;
    private Date maintanceExpiredDate;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public boolean isExpired(){
        return maintanceExpiredDate.after(new Date());
    }

    public boolean isIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getSeriesNum() {
        return SeriesNum;
    }

    public void setSeriesNum(String SeriesNum) {
        this.SeriesNum = SeriesNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getMaintanceExpiredDate() {
        return maintanceExpiredDate;
    }

    public void setMaintanceExpiredDate(Date m) {
        this.maintanceExpiredDate = m;
    }
    
    
}
