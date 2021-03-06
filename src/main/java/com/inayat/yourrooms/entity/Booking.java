package com.inayat.yourrooms.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "t_bookings")
public class Booking {
	
	public Booking() {
		this.BookingId =generateBookingId(); 
		this.bookingStatus = "INITIATED";
		this.paymentStatus = "PENDING";
	}
	
	private String generateBookingId() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "booking_price")
	private Double booking_price;
	
	@Column(name = "discount_coupon")
	private String discount_coupon;
	
	@Column(name = "discount_price")
	private Double discount_price;
	
	@Column(name = "coupon_discount")
	private Double coupon_discount;
	
	
	@Column(name = "gst")
	private Double gst;

	@OneToOne
	private User user;

	@Column(name = "rooms")
	private String rooms;

	@Column(name = "no_of_guests")
	private Integer noOfGuests;

	@Column(name = "booking_id")
	private String BookingId;

	@OneToOne
	private BookingTransaction transaction;

	@Column(name = "del_ind")
	private Boolean del_ind;

	@CreationTimestamp
	@Column(name = "create_dt")
	private Date create_dt;
	
	@UpdateTimestamp
	@Column(name = "update_dt")
	private Date update_dt;

	@Column(name = "create_user_id")
	private Long create_user_id;

	@Column(name = "update_user_id")
	private Long update_user_id;

	@Column(name = "booking_status")
	private String bookingStatus;
	
	@Column(name = "payment_status")
	private String paymentStatus;
	
	@Column(name = "checkin_date")
	private String checkinDate;
	
	@Column(name = "checkout_date")
	private String checkoutDate;
	
	@Column(name = "checkin_status")
	private String checkin_status;
	
	@Column(name = "checkout_status")
	private String checkout_status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBooking_price() {
		return booking_price;
	}

	public void setBooking_price(Double booking_price) {
		this.booking_price = booking_price;
	}

	
	public Double getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(Double discount_price) {
		this.discount_price = discount_price;
	}

	public Double getGst() {
		return gst;
	}

	public void setGst(Double gst) {
		this.gst = gst;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public Integer getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(Integer noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

	public String getBookingId() {
		return BookingId;
	}

	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}

	public BookingTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(BookingTransaction transaction) {
		this.transaction = transaction;
	}

	public Boolean getDel_ind() {
		return del_ind;
	}

	public void setDel_ind(Boolean del_ind) {
		this.del_ind = del_ind;
	}

	public Date getCreate_dt() {
		return create_dt;
	}

	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}

	public Date getUpdate_dt() {
		return update_dt;
	}

	public void setUpdate_dt(Date update_dt) {
		this.update_dt = update_dt;
	}

	public Long getCreate_user_id() {
		return create_user_id;
	}

	public void setCreate_user_id(Long create_user_id) {
		this.create_user_id = create_user_id;
	}

	public Long getUpdate_user_id() {
		return update_user_id;
	}

	public void setUpdate_user_id(Long update_user_id) {
		this.update_user_id = update_user_id;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getDiscount_coupon() {
		return discount_coupon;
	}

	public void setDiscount_coupon(String discount_coupon) {
		this.discount_coupon = discount_coupon;
	}

	public Double getCoupon_discount() {
		return coupon_discount;
	}

	public void setCoupon_discount(Double coupon_discount) {
		this.coupon_discount = coupon_discount;
	}

	public String getCheckin_status() {
		return checkin_status;
	}

	public void setCheckin_status(String checkin_status) {
		this.checkin_status = checkin_status;
	}

	public String getCheckout_status() {
		return checkout_status;
	}

	public void setCheckout_status(String checkout_status) {
		this.checkout_status = checkout_status;
	}

	

	
	

}
