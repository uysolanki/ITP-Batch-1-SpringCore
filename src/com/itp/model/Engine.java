package com.itp.model;

public class Engine {
		
			private int engineHP;
			private int engineLitre;
			private String engineType;
			private String engineMfgName;
			
			public Engine() {}
			public Engine(int engineHP, int engineLitre, String engineType, String engineMfgName) {
				
				this.engineHP = engineHP;
				this.engineLitre = engineLitre;
				this.engineType = engineType;
				this.engineMfgName = engineMfgName;
			}
			public int getEngineHP() {
				return engineHP;
			}
			public void setEngineHP(int engineHP) {
				this.engineHP = engineHP;
			}
			public int getEngineLitre() {
				return engineLitre;
			}
			public void setEngineLitre(int engineLitre) {
				this.engineLitre = engineLitre;
			}
			public String getEngineType() {
				return engineType;
			}
			public void setEngineType(String engineType) {
				this.engineType = engineType;
			}
			public String getEngineMfgName() {
				return engineMfgName;
			}
			public void setEngineMfgName(String engineMfgName) {
				this.engineMfgName = engineMfgName;
			}
			
			@Override
			public String toString() {
				return "Engine [engineHP=" + engineHP + ", engineLitre=" + engineLitre + ", engineType=" + engineType
						+ ", engineMfgName=" + engineMfgName + "]";
			}
			
			
			
			
}
