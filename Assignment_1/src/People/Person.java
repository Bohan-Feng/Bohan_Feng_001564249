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
    private long phoneNum;
    private long faxNum;
    private String emailAddr;
    private long ssn; // Social Security number
    private long mrn; //Medical record number
    private long hpbn; //Health plan beneficiary number
    private long ban; // Bank account number;
    private long ln; //license number
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

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public long getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(long faxNum) {
        this.faxNum = faxNum;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getMrn() {
        return mrn;
    }

    public void setMrn(long mrn) {
        this.mrn = mrn;
    }

    public long getHpbn() {
        return hpbn;
    }

    public void setHpbn(long hpbn) {
        this.hpbn = hpbn;
    }

    public long getBan() {
        return ban;
    }

    public void setBan(long ban) {
        this.ban = ban;
    }

    public long getLn() {
        return ln;
    }

    public void setLn(long ln) {
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
