	package com.inayat.yourrooms.controllers;

import java.io.IOException;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inayat.yourrooms.dto.BookingDTO;
import com.inayat.yourrooms.dto.HotelDTO;
import com.inayat.yourrooms.dto.RoomsDTO;
import com.inayat.yourrooms.model.ApiResponse;
import com.inayat.yourrooms.service.HotelService;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	HotelService hotelservice;

	@RequestMapping(value = "/add-or-update-hotel", method = RequestMethod.POST)
	public ResponseEntity<ApiResponse> addOrUpdate(@RequestBody HotelDTO hotel) {
		ApiResponse resp = hotelservice.addOrUpdate(hotel);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAll-hotels", method = RequestMethod.GET)
	public ResponseEntity<ApiResponse> getAllHotel(@RequestParam(required = false) String city,@RequestParam(required = false) String pincode) {
		ApiResponse resp = hotelservice.getAllHotel(city,pincode);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add-rooms-to-hotel", method = RequestMethod.POST)
	public ResponseEntity<ApiResponse> addRoomsTOHotel(@RequestBody RoomsDTO rooms) {
		ApiResponse resp = hotelservice.addRoomsTOHotel(rooms);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAll-rooms/{hotel_id}", method = RequestMethod.GET)
	public ResponseEntity<ApiResponse> getAllHotelRooms(@PathVariable("hotel_id") Long hotel_id) {
		ApiResponse resp = hotelservice.getAllHotelRooms(hotel_id);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getRoom/{room_id}", method = RequestMethod.GET)
	public ResponseEntity<ApiResponse> getRoom(@PathVariable("room_id") Long room_id) {
		ApiResponse resp = hotelservice.getRoom(room_id);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public ResponseEntity<ApiResponse> BookRoom(@RequestBody BookingDTO request) throws IOException {
		ApiResponse resp = hotelservice.BookRoom(request);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/apply-coupon/{bookingId}/{code}", method = RequestMethod.GET)
	public ResponseEntity<ApiResponse> applyCoupon(@PathVariable("code") String code, @PathVariable("bookingId") String bookingId) throws NumberFormatException, IOException {
		ApiResponse resp = hotelservice.applyCoupon(code,Long.parseLong(bookingId));
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	
}