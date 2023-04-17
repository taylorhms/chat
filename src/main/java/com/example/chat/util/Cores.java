package com.example.chat.util;

public class Cores {
	public static String aleatorio() {
		String[] cores = {
				"#FFC886", "#C8FF86", "#86FFC8", "#86C8FF", "#FF86C8"
		};
		return cores[(int)(Math.random() * cores.length)];
	}
	public static String sequencial(int i) {
		String[] cores = {
				"#FFC886", "#C8FF86", "#86FFC8", "#86C8FF", "#FF86C8"
		};
		return cores[i % cores.length];
	}
}
	