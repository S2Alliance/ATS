package com.freealliance.util;

public class StatusSingleton {
	private static StatusSingleton instance = null;

	protected StatusSingleton() {
		// Exists only to defeat instantiation.
	}

	public static StatusSingleton getInstance() {
		if (instance == null) {
			instance = new StatusSingleton();
		}
		return instance;
	}
}
