/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author abc
 */
public class LSP_DTO {
    String roomId;
    String cusId;
    String staffId;
    Date checkInDate;
    Date checkOutDate;
    public LSP_DTO (String roomId, String cusId,String staffId, Date checkInDate, Date checkOutDate) {
        this.roomId = roomId;
        this.cusId = cusId;
        this.staffId = staffId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
    public String getRoomId() {
        return roomId;
    }

    public void setRoomd(String roomId) {
        this.roomId = roomId;
    }
    
    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }
    
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    
    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public boolean checkContain(String str){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if(roomId.toUpperCase().contains(str.toUpperCase())==true ||
           cusId.toUpperCase().contains(str.toUpperCase())==true ||
           staffId.toUpperCase().contains(str.toUpperCase())==true ||
           df.format(checkInDate).toUpperCase().contains(str.toUpperCase())==true ||
           df.format(checkOutDate).toUpperCase().contains(str.toUpperCase())==true)   {
            return true;
        }else{
            return false;
        }
        
    
    }
}
