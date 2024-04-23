package com.main.service;

public class DateConverterService {

	public String convertMonthValueToString(int month)
	{
		int[] monthValues = {1,2,3,4,5,6,7,8,9,10,11,12};
		String[] mmmFormattedMonth = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		String mmm = null;
		for(int index = 0; index<monthValues.length; index++)
		{
			if(monthValues[index] == month)
			{
				 mmm = mmmFormattedMonth[monthValues[index]-1];
			}
		}
		
		return mmm;
		
	}
}
