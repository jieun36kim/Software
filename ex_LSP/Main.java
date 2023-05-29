package ex_LSP;

public class Main {
	public static void main(String args[]) {
		LecturerAtGS lect01 = new LecturerAtGS();
		lect01.Lecturer();
		
		LecturerNight lect02 = new LecturerNight();
		lect02.Lecturer();
		
		LecturerWithWork lect03 = new LecturerWithWork();
		lect03.Lecturer();
		
		LecturerNormal lect04 = new LecturerNormal();
		lect04.Lecturer();
	}
}
