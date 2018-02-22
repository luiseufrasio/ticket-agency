package com.packtpub.wflydevelopment.chapter3.boundary;

import com.packtpub.wflydevelopment.chapter3.exception.NoSuchSeatException;
import com.packtpub.wflydevelopment.chapter3.exception.NotEnoughMoneyException;
import com.packtpub.wflydevelopment.chapter3.exception.SeatBookedException;

public interface TheatreBookerRemote {
	int getAccountBalance();
	String bookSeat(int seatId) throws SeatBookedException, NotEnoughMoneyException, NoSuchSeatException; 
}
