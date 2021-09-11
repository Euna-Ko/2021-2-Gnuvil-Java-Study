package week2;
//Practice interface2
//callback - A


public class Browser implements OnDownloadListener{
	
	//public: 다른 클래스에서도 사용 가능, private: 다른 클래스에서는 사용 불가
	public void imgClick() {
		//this는 Browser이지만 OnDownloadListener을 넘기는 것 처럼 사용 가능
		Downloader loader = new Downloader(this);
		loader.start();
	}
	
	@Override
	public void onDownFinish() {
		System.out.println("Browser : onDownFinish()");
	}
	
	@Override
	public void onDownFailed() {
		
	}

}
