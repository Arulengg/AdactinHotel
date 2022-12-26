package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends BaseClass{
    
    public SearchHotelPojo() {
	PageFactory.initElements(driver, this);
	
    }
    @FindBy(id="Location")
    
    private WebElement Location;
    @FindBy(id="Hotels")
    private WebElement Hotels;
    @FindBy(id="RoomType")
    private WebElement RoomType;
    @FindBy(id="NumberOfRooms")
    private WebElement NumberOfRooms;
    @FindBy(id="CheckInDate")
    private WebElement CheckInDate;
    @FindBy(id="CheckOutDate")
    private WebElement CheckOutDate;
    @FindBy(id="AdultsperRoom")
    private WebElement AdultsperRoom;
    @FindBy(id="ChildrenPerRoom")
    private WebElement ChildrenPerRoom;
    
    public WebElement getLocation() {
        return Location;
    }
    public void setLocation(WebElement location) {
        Location = location;
    }
    public WebElement getHotels() {
        return Hotels;
    }
    public void setHotels(WebElement hotels) {
        Hotels = hotels;
    }
    public WebElement getRoomType() {
        return RoomType;
    }
    public void setRoomType(WebElement roomType) {
        RoomType = roomType;
    }
    public WebElement getNumberOfRooms() {
        return NumberOfRooms;
    }
    public void setNumberOfRooms(WebElement numberOfRooms) {
        NumberOfRooms = numberOfRooms;
    }
    public WebElement getCheckInDate() {
        return CheckInDate;
    }
    public void setCheckInDate(WebElement checkInDate) {
        CheckInDate = checkInDate;
    }
    public WebElement getCheckOutDate() {
        return CheckOutDate;
    }
    public void setCheckOutDate(WebElement checkOutDate) {
        CheckOutDate = checkOutDate;
    }
    public WebElement getAdultsperRoom() {
        return AdultsperRoom;
    }
    public void setAdultsperRoom(WebElement adultsperRoom) {
        AdultsperRoom = adultsperRoom;
    }
    public WebElement getChildrenPerRoom() {
        return ChildrenPerRoom;
    }
    public void setChildrenPerRoom(WebElement childrenPerRoom) {
        ChildrenPerRoom = childrenPerRoom;
    }
    

}
