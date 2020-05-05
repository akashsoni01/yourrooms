package com.inayat.yourrooms.translator;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inayat.yourrooms.dto.BookingResponse;
import com.inayat.yourrooms.entity.Bookings;

public class BookingResponseTranslator {

	public static BookingResponse translateToDTO(Bookings dao) throws IOException {
		BookingResponse dto = new BookingResponse();
		dto.setBooking_price(dao.getBooking_price());
		dto.setBookingId(dao.getBookingId());
		dto.setBookingStatus(dao.getBookingStatus());
		dto.setCheckinDate(dao.getCheckinDate());
		dto.setCheckout_date(dao.getCheckoutDate());
		dto.setDiscount_coupon(dao.getDiscount_coupon());
		dto.setDiscount_price(dao.getDiscount_price());
		dto.setCoupon_discount(dao.getCoupon_discount());
		dto.setId(dao.getId());
		dto.setGst(dao.getGst());
		dto.setNoOfGuests(dao.getNoOfGuests());
		dto.setPaymentStatus(dao.getPaymentStatus());
		ObjectMapper mapper = new ObjectMapper();
		Long[] rooms = mapper.readValue(dao.getRooms(), Long[].class);
		dto.setRooms(rooms);
		dto.setTransaction(dao.getTransaction());
		dto.setUserId(dao.getUser().getId());
		dto.setCheckin_status(dao.getCheckin_status());
		dto.setCheckout_status(dao.getCheckout_status());
		
		return dto;
	}


}
