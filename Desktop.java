package org.system;

public class Desktop {

	public void desktopSize() {
		System.out.println("The size of the monitor is");
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopSize();
		
		Computer system = new Computer();
		system.computerModel();
		system.desktopSize();

}}
