package com.sapient.service;

public class CalcService {

	public double calcSeries(int a, int b, int c){
		
		return (double)(a+b+c)/2;
	}
	
	public double round2N(double val,int n){
		double p = Math.pow(10, n);
		double res = Math.round(val*p)/p;
		return res;
	}

}
