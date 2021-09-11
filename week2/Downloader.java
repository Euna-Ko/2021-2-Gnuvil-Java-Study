package week2;
//Practice interface2
//callback - B

import java.lang.Thread;
import java.lang.InterruptedException;


public class Downloader {
	
	private OnDownloadListener mListener;
	
	public Downloader(OnDownloadListener listener) {
		mListener = listener;
	}
	
	public void start() {
		
		System.out.println("Download start");
		
		//Thread는 실패할 가능성이 있기 때문에 try-catch 필수
		try {
			Thread.sleep(5000); //ms(밀리세컨드)사용.약 5초
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//callback 지점
		mListener.onDownFinish();
	}

}
