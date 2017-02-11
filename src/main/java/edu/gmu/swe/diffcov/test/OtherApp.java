package edu.gmu.swe.diffcov.test;

public class OtherApp {
	public void foo(){
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int n = 10;
				Runnable r = new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						int n = 10;
					}
				};
			}
		});
	}
}
