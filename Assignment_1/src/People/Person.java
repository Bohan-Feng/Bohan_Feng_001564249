/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import java.io.File;

/**
 *
 * @author Bohan Feng
 */
public class Person {
    private String name;
    private String geoData;
    private String brithday;
    private int phoneNum;
    private int faxNum;
    private String emailAddr;
    private int ssn; // Social Security number
    private int mrn; //Medical record number
    private int hpbn; //Health plan beneficiary number
    private int ban; // Bank account number;
    private int ln; //license number
    private String vID; // Vehicle identifiers and serial numbers including license plates
    private String dID; // Device identifiers and serial numbers
    private String LinkedIn; // linkedin url
    private String ipa; //Internet protocol addresses
    private File photo; //user photo
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", geoDate=" + geoData + ", phoneNum=" + phoneNum + ", faxNum=" + faxNum + ", emailAddr=" + emailAddr + ", ssn=" + ssn + ", mrn=" + mrn + ", hpbn=" + hpbn + ", ban=" + ban + ", ln=" + ln + ", vID=" + vID + ", dID=" + dID + ", LinkedIn=" + LinkedIn + ", ipa=" + ipa + ", photo=" + photo + '}';
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
    
    
    
    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeoData() {
        return geoData;
    }

    public void setGeoData(String geoData) {
        this.geoData = geoData;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(int faxNum) {
        this.faxNum = faxNum;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getMrn() {
        return mrn;
    }

    public void setMrn(int mrn) {
        this.mrn = mrn;
    }

    public int getHpbn() {
        return hpbn;
    }

    public void setHpbn(int hpbn) {
        this.hpbn = hpbn;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getLn() {
        return ln;
    }

    public void setLn(int ln) {
        this.ln = ln;
    }

    public String getvID() {
        return vID;
    }

    public void setvID(String vID) {
        this.vID = vID;
    }

    public String getdID() {
        return dID;
    }

    public void setdID(String dID) {
        this.dID = dID;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getIpa() {
        return ipa;
    }

    public void setIpa(String ipa) {
        this.ipa = ipa;
    }
    
    
    
}
