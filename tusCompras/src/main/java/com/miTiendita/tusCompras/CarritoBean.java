package com.miTiendita.tusCompras;

import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;

public class CarritoBean {
	
	private String estatusPedido;
	private double totalCompra;
	private int numeroArticulos;
	
	
	
	
	
	/*
	 * public void calculateTotal(AjaxBehaviorEvent event)
            throws AbortProcessingException {
        int ticketsNum = 1;
        int ticketPrice = 0;
        int total;

        if (tickets.trim().length() > 0) {
            ticketsNum = Integer.parseInt(tickets);
        }
        if (price.trim().length() > 0) {
            ticketPrice = Integer.parseInt(price);
        }
        total = (ticketsNum * ticketPrice);
        totalValue = String.valueOf(total) + ".00";
    }
	 * 
	 * 
	 * */
}
