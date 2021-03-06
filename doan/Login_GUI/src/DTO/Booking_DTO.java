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
 * @author TienVinh
 */
public class Booking_DTO {
    String bookId;
    String customerId;
    String roomId;
    Date checkInDate;
    Date checkOutDate;

    public Booking_DTO(String bookId, String customerId, String roomId, Date checkInDate, Date checkOutDate) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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
        System.out.println("co vo");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if(bookId.toUpperCase().contains(str.toUpperCase())==true ||
           customerId.toUpperCase().contains(str.toUpperCase())==true ||
           df.format(checkInDate).toUpperCase().contains(str.toUpperCase())==true ||
           df.format(checkOutDate).toUpperCase().contains(str.toUpperCase())==true ){
            return true;
        }else{
            return false;
        }
        
    
    }
}
