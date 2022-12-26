package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPOJOHOME  {

    

    @FindBy(id = "username")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login")
    private WebElement login;
    @FindBy(id = "location")
    private WebElement location;
    @FindBy(id = "hotels")
    private WebElement hotels;
    @FindBy(id = "room_type")
    private WebElement RoomType;
    @FindBy(id = "room_nos")
    private WebElement NumberOfRooms;
    @FindBy(id = "datepick_in")
    private WebElement CheckInDate;
    @FindBy(id = "datepick_out")
    private WebElement CheckOutDate;
    @FindBy(id = "adult_room")
    private WebElement AdultsperRoom;
    @FindBy(id = "child_room")
    private WebElement ChildrenPerRoom;
    @FindBy(id = "Search_hotel")
    private WebElement searchButton;
    @FindBy(id = "radio_btn")
    private WebElement radioButton;
    @FindBy(id = "continue_Btn")
    private WebElement continueButton;
    @FindBy(id = "first_name")
    private WebElement firstName;
    @FindBy(id = "last_name")
    private WebElement LastName;
    @FindBy(id = "billing_address")
    private WebElement BillingAddress;
    @FindBy(id = "credit_number")
    private WebElement CreditCardNo;
    @FindBy(id = "creditcard_type")
    private WebElement CreditCardType;
    @FindBy(id = "expiry_date")
    private WebElement ExpiryDate;
    @FindBy(id = "CVV_numbere")
    private WebElement CVVNUmber;
    @FindBy(id = "book_now")
    private WebElement book_now;

    public WebElement getUserName() {
	return userName;
    }

    public void setUserName(WebElement userName) {
	this.userName = userName;
    }

    public WebElement getPassword() {
	return password;
    }

    public void setPassword(WebElement password) {
	this.password = password;
    }

    public WebElement getLogin() {
	return login;
    }

    public void setLogin(WebElement login) {
	this.login = login;
    }

    public WebElement getLocation() {
	return location;
    }

    public void setLocation(WebElement location) {
	this.location = location;
    }

    public WebElement getHotels() {
	return hotels;
    }

    public void setHotels(WebElement hotels) {
	this.hotels = hotels;
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

    public WebElement getSearchButton() {
	return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
	this.searchButton = searchButton;
    }

    public WebElement getRadioButton() {
	return radioButton;
    }

    public void setRadioButton(WebElement radioButton) {
	this.radioButton = radioButton;
    }

    public WebElement getContinueButton() {
	return continueButton;
    }

    public void setContinueButton(WebElement continueButton) {
	this.continueButton = continueButton;
    }

    public WebElement getFirstName() {
	return firstName;
    }

    public void setFirstName(WebElement firstName) {
	this.firstName = firstName;
    }

    public WebElement getLastName() {
	return LastName;
    }

    public void setLastName(WebElement lastName) {
	LastName = lastName;
    }

    public WebElement getBillingAddress() {
	return BillingAddress;
    }

    public void setBillingAddress(WebElement billingAddress) {
	BillingAddress = billingAddress;
    }

    public WebElement getCreditCardNo() {
	return CreditCardNo;
    }

    public void setCreditCardNo(WebElement creditCardNo) {
	CreditCardNo = creditCardNo;
    }

    public WebElement getCreditCardType() {
	return CreditCardType;
    }

    public void setCreditCardType(WebElement creditCardType) {
	CreditCardType = creditCardType;
    }

    public WebElement getExpiryDate() {
	return ExpiryDate;
    }

    public void setExpiryDate(WebElement expiryDate) {
	ExpiryDate = expiryDate;
    }

    public WebElement getCVVNUmber() {
	return CVVNUmber;
    }

    public void setCVVNUmber(WebElement cVVNUmber) {
	CVVNUmber = cVVNUmber;
    }

    public WebElement getBook_now() {
	return book_now;
    }

    public void setBook_now(WebElement book_now) {
	this.book_now = book_now;
    }

}
