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
		
		//Thread�� ������ ���ɼ��� �ֱ� ������ try-catch �ʼ�
		try {
			Thread.sleep(5000); //ms(�и�������)���.�� 5��
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//callback ����
		mListener.onDownFinish();
	}

}
