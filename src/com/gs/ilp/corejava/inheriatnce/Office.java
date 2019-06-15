package com.gs.ilp.corejava.inheriatnce;

public class Office {
	public static void main(String[] args) {

		Interviewer hr = new HRExecutive(23, 12, "mihit");
		Interviewer man = new Manager();

		Interviewer[] interviewers = new Interviewer[2];

		interviewers[0] = hr;
		interviewers[1] = man;

		for (Interviewer interviewer : interviewers) {
			interviewer.conductInterview();
			if(interviewer instanceof HRExecutive) {
				HRExecutive myHr = (HRExecutive) interviewer;
				myHr.processSalary();
			}
		}
	}

}
