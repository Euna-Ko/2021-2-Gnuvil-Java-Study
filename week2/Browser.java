package week2;
//Practice interface2
//callback - A


public class Browser implements OnDownloadListener{
	
	//public: �ٸ� Ŭ���������� ��� ����, private: �ٸ� Ŭ���������� ��� �Ұ�
	public void imgClick() {
		//this�� Browser������ OnDownloadListener�� �ѱ�� �� ó�� ��� ����
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
