package com.thread;

class NewThread implements Runnable{
	Thread t;
	
	public NewThread(){
		t = new Thread(this, "Child Thread");
		t.start();
	}
	
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println(i + " : " + t);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exited");
	}
}

//class NewThread extends Thread{
//	public NewThread(){
//		super("Child Thread");
//		start();
//	}
//	
//	public void run() {
//		try {
//			for(int i=0; i<5; i++) {
//				System.out.println(i + " : " + this);
//				Thread.sleep(1000);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Child Thread Exited");
//	}
//}

public class ThreadDemo {
	public static void main(String[] args) {
		new NewThread();
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(7);
		System.out.println(t);
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(i + " : " + t);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("My Thread Exited");
	}
}
