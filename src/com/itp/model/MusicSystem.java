package com.itp.model;

import org.springframework.stereotype.Component;

@Component
public class MusicSystem {

		private String msBrand;
		private double price;
		
		public MusicSystem() {}
		public MusicSystem(String msBrand, double price) {
			this.msBrand = msBrand;
			this.price = price;
		}
		public String getMsBrand() {
			return msBrand;
		}
		public void setMsBrand(String msBrand) {
			this.msBrand = msBrand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "MusicSystem [msBrand=" + msBrand + ", price=" + price + "]";
		}
		
		
		
		
}
