package it.corso.tv;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tv {

	final static Logger logger = Logger.getLogger(Tv.class);
	private int channel;

	public void stampaChannel() {
		logger.info("Canale stampato: "+ channel);
	}

	public void settaChannel(int channel) {
		logger.info("Canale setta: "+ channel);
	}
	
	public static Logger getLogger() {
		return logger;
	}
}
